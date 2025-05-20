package com.jesimielsilva.desafio_01.infrastructure.persistence;

import com.jesimielsilva.desafio_01.domain.enums.TaskStatus;
import com.jesimielsilva.desafio_01.domain.model.Task;
import com.jesimielsilva.desafio_01.domain.repository.TaskRepository;
import com.jesimielsilva.desafio_01.infrastructure.persistence.entity.TaskEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public class TaskJpaRepository implements TaskRepository {

    @Autowired
    public final SpringDataTaskRepository repository;

    public TaskJpaRepository(SpringDataTaskRepository repository) {
        this.repository = repository;
    }

    @Override
    public Task save(Task task) {
        TaskEntity entity = TaskEntity.fromDomain(task);
        TaskEntity saved = repository.save(entity);
        return saved.toDomain();
    }

    @Override
    public Optional<Task> findById(Long id) {
        return repository.findById(id)
                .map(TaskEntity::toDomain);
    }

    @Override
    public List<Task> findAll() {
        return repository.findAll()
                .stream()
                .map(TaskEntity::toDomain)
                .toList();
    }

    @Override
    public List<Task> findByStatus(TaskStatus taskStatus) {
        return repository.findByStatus(taskStatus)
                .stream()
                .map(TaskEntity::toDomain)
                .toList();
    }

    @Override
    public void deleteById(Long id) {
        repository.deleteById(id);
    }
}
