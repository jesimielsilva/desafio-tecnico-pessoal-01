package com.jesimielsilva.desafio_01.application.usercases;

import com.jesimielsilva.desafio_01.domain.repository.TaskRepository;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class DeleteTaskUseCase {

    private final TaskRepository taskRepository;

    public DeleteTaskUseCase(TaskRepository taskRepository) {
        this.taskRepository = taskRepository;
    }

    public void execute(Long id) {
        if (!taskRepository.findById(id).isPresent()) {
            throw new EntityNotFoundException("Task com ID " + id + " não encontrada");
        }
        taskRepository.deleteById(id);
    }
}
