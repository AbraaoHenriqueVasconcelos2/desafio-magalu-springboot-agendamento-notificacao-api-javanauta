package com.exemplo.demo.desafio_magalu_agendamento_notificacao_api.controller.dto.in;

import java.time.LocalDateTime;

import com.fasterxml.jackson.annotation.JsonFormat;

public record ScheduleRecordIn(String recipientEmail, 
                          String recipientPhone, 
                          String message, 
                          @JsonFormat(shape=JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd HH:mm:ss") LocalDateTime sendDateTime
                           ) {
    

}
