package com.jesimielsilva.desafio_01.infrastructure.controller.dto;


import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
public class TaskDto {

    private long id;
    private String title;
    private String description;
    private LocalDate dueDate;

}
