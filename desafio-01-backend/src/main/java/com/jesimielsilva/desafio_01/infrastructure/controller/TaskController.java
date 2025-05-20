package com.jesimielsilva.desafio_01.infrastructure.controller;

import com.jesimielsilva.desafio_01.application.usercases.CreateTaskUseCase;
import com.jesimielsilva.desafio_01.domain.model.Task;
import com.jesimielsilva.desafio_01.infrastructure.controller.dto.TaskDto;
import com.jesimielsilva.desafio_01.infrastructure.persistence.mapper.TaskMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/tasks")
public class TaskController {

    @Autowired
    private final CreateTaskUseCase createTaskUseCase;

    public TaskController(CreateTaskUseCase createTaskUseCase) {
        this.createTaskUseCase = createTaskUseCase;
    }

    @PostMapping("/save")
    public ResponseEntity<Task> create(@RequestBody TaskDto taskDto) {
        Task task = TaskMapper.toDomain(taskDto);
        Task created = createTaskUseCase.execute(task);
        return ResponseEntity.status(HttpStatus.CREATED).body(created);
    }
}
