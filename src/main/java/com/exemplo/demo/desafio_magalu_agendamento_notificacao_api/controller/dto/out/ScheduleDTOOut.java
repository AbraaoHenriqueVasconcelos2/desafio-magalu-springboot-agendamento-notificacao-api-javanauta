package com.exemplo.demo.desafio_magalu_agendamento_notificacao_api.controller.dto.out;

import java.time.LocalDateTime;

import com.exemplo.demo.desafio_magalu_agendamento_notificacao_api.infrastructure.entities.enums.StatusNotificationEnum;
import com.fasterxml.jackson.annotation.JsonFormat;

public record ScheduleDTOOut(Long id,
                          String recipientEmail, 
                          String recipientPhone, 
                          String message, 
                          @JsonFormat(shape=JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd HH:mm:ss") LocalDateTime sendDateTime,
                          StatusNotificationEnum statusNotification
                           ) {
    

}
