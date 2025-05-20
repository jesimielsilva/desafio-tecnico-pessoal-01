package com.jesimielsilva.desafio_01.domain.enums;

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

}
