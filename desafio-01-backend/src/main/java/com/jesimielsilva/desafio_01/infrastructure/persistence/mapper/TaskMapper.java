package com.jesimielsilva.desafio_01.infrastructure.persistence.mapper;

import com.jesimielsilva.desafio_01.domain.enums.TaskStatus;
import com.jesimielsilva.desafio_01.domain.model.Task;
import com.jesimielsilva.desafio_01.infrastructure.controller.dto.TaskDto;
import com.jesimielsilva.desafio_01.infrastructure.controller.dto.TaskResponseDto;
import com.jesimielsilva.desafio_01.infrastructure.persistence.entity.TaskEntity;


public class TaskMapper {

    public static Task toDomain(TaskDto taskDto) {
        return new Task(
                taskDto.getId(),
                taskDto.getTitle(),
                taskDto.getDescription(),
                TaskStatus.PENDENTE,
                taskDto.getDueDate()
        );
    }

    public static TaskResponseDto toResponseDto(Task task) {
        TaskResponseDto dto = new TaskResponseDto();
        dto.setId(task.getId());
        dto.setTitle(task.getTitle());
        dto.setDescription(task.getDescription());
        dto.setStatus(task.getStatus());
        dto.setDueDate(task.getDueDate());
        return dto;
    }

    public static TaskEntity  toEntity(Task task) {
        TaskEntity entity = new TaskEntity();
        entity.setId(task.getId());
        entity.setTitle(task.getTitle());
        entity.setDescription(task.getDescription());
        entity.setStatus(task.getStatus());
        entity.setDueDate(task.getDueDate());
        return entity;
    }

    public static  Task toDomain(TaskEntity entity) {
        return new Task(
                entity.getId(),
                entity.getTitle(),
                entity.getDescription(),
                TaskStatus.valueOf(String.valueOf(entity.getStatus())),
                entity.getDueDate()
        );
    }

}
