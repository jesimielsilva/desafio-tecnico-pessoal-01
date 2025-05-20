package com.jesimielsilva.desafio_01.domain.repository;

import com.jesimielsilva.desafio_01.domain.enums.TaskStatus;
import com.jesimielsilva.desafio_01.domain.model.Task;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

public interface TaskRepository {

    Task save(Task task);
    Optional<Task> findById(Long id);
    List<Task> findAll();
    List<Task> findByStatus(TaskStatus taskStatus);
    void deleteById(Long id);

}
