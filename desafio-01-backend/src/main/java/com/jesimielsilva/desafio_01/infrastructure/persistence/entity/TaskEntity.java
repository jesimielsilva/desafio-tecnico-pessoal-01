package com.jesimielsilva.desafio_01.infrastructure.persistence.entity;

import com.jesimielsilva.desafio_01.domain.enums.TaskStatus;
import com.jesimielsilva.desafio_01.domain.model.Task;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class TaskEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;
    private String description;
    private TaskStatus status;
    @Column(name = "due_date")
    private LocalDate dueDate;


    public static TaskEntity fromDomain(Task task) {
        return new TaskEntity(
                task.getId(),
                task.getTitle(),
                task.getDescription(),
                task.getStatus(),
                task.getDueDate()
        );
    }

    public Task toDomain() {
        return new Task(
                this.id,
                this.title,
                this.description,
                this.status,
                this.dueDate
        );
    }

}
