package com.jesimielsilva.desafio_01.infrastructure.controller.dto;

import com.jesimielsilva.desafio_01.domain.enums.TaskStatus;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
public class TaskResponseDto {
    private Long id;
    private String title;
    private String description;
    private TaskStatus status;
    private LocalDate dueDate;
}
