package com.jesimielsilva.desafio_01.infrastructure.controller;

import com.jesimielsilva.desafio_01.application.usercases.CreateTaskUseCase;
import com.jesimielsilva.desafio_01.application.usercases.ListTaskUseCase;
import com.jesimielsilva.desafio_01.domain.model.Task;
import com.jesimielsilva.desafio_01.infrastructure.controller.dto.TaskDto;
import com.jesimielsilva.desafio_01.infrastructure.controller.dto.TaskResponseDto;
import com.jesimielsilva.desafio_01.infrastructure.persistence.mapper.TaskMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/tasks")
public class TaskController {

    @Autowired
    private final CreateTaskUseCase createTaskUseCase;

    @Autowired
    private final ListTaskUseCase listTaskUseCase;

    public TaskController(CreateTaskUseCase createTaskUseCase, ListTaskUseCase listTaskUseCase) {
        this.createTaskUseCase = createTaskUseCase;
        this.listTaskUseCase = listTaskUseCase;
    }

    @PostMapping("/save")
    public ResponseEntity<Task> create(@RequestBody TaskDto taskDto) {
        Task task = TaskMapper.toDomain(taskDto);
        Task created = createTaskUseCase.execute(task);
        return ResponseEntity.status(HttpStatus.CREATED).body(created);
    }

    @GetMapping("/list")
    public ResponseEntity<List<TaskResponseDto>> listAll() {
        List<Task> tasks = listTaskUseCase.execute();
        List<TaskResponseDto> dtos = tasks.stream()
                .map(TaskMapper::toResponseDto)
                .toList();
        return ResponseEntity.ok(dtos);
    }

}
