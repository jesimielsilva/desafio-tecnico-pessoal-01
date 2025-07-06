package com.jesimielsilva.desafio_01.application.usercases;

import com.jesimielsilva.desafio_01.domain.model.Task;
import com.jesimielsilva.desafio_01.domain.repository.TaskRepository;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class FindTaskByIdUserCase {

    private final TaskRepository taskRepository;

    public FindTaskByIdUserCase(TaskRepository taskRepository) {
        this.taskRepository = taskRepository;
    }

    public Task execute(Long id) {
        return taskRepository.findById(id)
                .orElseThrow(() -> new EntityNotFoundException("Task com ID " + id + " não encontrada"));
    }
}
