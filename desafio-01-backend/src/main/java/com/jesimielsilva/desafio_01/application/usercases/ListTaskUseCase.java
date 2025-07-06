package com.jesimielsilva.desafio_01.application.usercases;

import com.jesimielsilva.desafio_01.domain.model.Task;
import com.jesimielsilva.desafio_01.domain.repository.TaskRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ListTaskUseCase {

    private final TaskRepository taskRepository;

    public ListTaskUseCase(TaskRepository taskRepository) {
        this.taskRepository = taskRepository;
    }

    public List<Task> execute() {
        return taskRepository.findAll();
    }
}
