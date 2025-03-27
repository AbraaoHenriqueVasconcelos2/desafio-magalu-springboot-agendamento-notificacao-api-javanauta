package com.exemplo.demo.desafio_magalu_agendamento_notificacao_api.business.exception;

public class NotFoundException extends RuntimeException {
    
    public NotFoundException(String message){
        super(message);
    }
}
