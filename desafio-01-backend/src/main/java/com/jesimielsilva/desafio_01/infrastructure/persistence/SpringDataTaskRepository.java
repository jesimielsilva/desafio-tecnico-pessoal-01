package com.jesimielsilva.desafio_01.infrastructure.persistence;

import com.jesimielsilva.desafio_01.domain.enums.TaskStatus;
import com.jesimielsilva.desafio_01.domain.model.Task;
import com.jesimielsilva.desafio_01.infrastructure.persistence.entity.TaskEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SpringDataTaskRepository extends JpaRepository<TaskEntity, Long> {

    List<TaskEntity> findByStatus(TaskStatus taskStatus);

}
