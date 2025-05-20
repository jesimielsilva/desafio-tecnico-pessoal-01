package com.jesimielsilva.desafio_01.application.usercases;

import com.jesimielsilva.desafio_01.domain.model.Task;
import com.jesimielsilva.desafio_01.domain.repository.TaskRepository;
import com.jesimielsilva.desafio_01.infrastructure.persistence.TaskJpaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CreateTaskUseCase {

    @Autowired
    private final TaskRepository repository;

    public CreateTaskUseCase(TaskRepository repository) {
        this.repository = (TaskJpaRepository) repository;
    }

    public Task execute(Task task) {
        return repository.save(task);
    }
}
