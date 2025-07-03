package com.jesimielsilva.desafio_01.domain.enums;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import lombok.Getter;

@Getter
public enum TaskStatus {

    ATIVO("ATIVO"),
    INATIVO("INATIVO"),
    PENDENTE("PENDENTE"),
    CANCELADO("CANCELADO");

    private final String descriStatus;

    TaskStatus(String descriStatus) {
        this.descriStatus = descriStatus;
    }

    @JsonCreator
    public static TaskStatus fromDescricao(String descricao) {
        for (TaskStatus status : TaskStatus.values()) {
            if (status.getDescriStatus().equalsIgnoreCase(descricao)) {
                return status;
            }
        }
        throw new IllegalArgumentException("Status inválido: " + descricao);
    }

    @JsonValue
    public String toValue() {
        return this.descriStatus;
    }

}
