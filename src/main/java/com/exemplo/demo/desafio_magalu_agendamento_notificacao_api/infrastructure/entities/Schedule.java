package com.exemplo.demo.desafio_magalu_agendamento_notificacao_api.infrastructure.entities;

import java.time.LocalDateTime;

import com.exemplo.demo.desafio_magalu_agendamento_notificacao_api.infrastructure.entities.enums.StatusNotificationEnum;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.PrePersist;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Table(name = "agendamento")
@Entity
@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Schedule {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String recipientEmail;
    private String recipientPhone;
    private LocalDateTime sendDateTime;
    private LocalDateTime scheduledDateTime;
    private LocalDateTime modifiedDateTime;
    private String message;
    private StatusNotificationEnum statusNotification;

    @PrePersist
    private void prePersist(){
        sendDateTime = LocalDateTime.now();
        statusNotification = StatusNotificationEnum.SCHEDULED;
    }
}

