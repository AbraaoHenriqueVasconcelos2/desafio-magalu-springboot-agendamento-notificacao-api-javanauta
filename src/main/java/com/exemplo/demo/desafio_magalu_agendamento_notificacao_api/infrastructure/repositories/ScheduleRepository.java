package com.exemplo.demo.desafio_magalu_agendamento_notificacao_api.infrastructure.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.exemplo.demo.desafio_magalu_agendamento_notificacao_api.infrastructure.entities.Schedule;

public interface ScheduleRepository extends JpaRepository<Schedule, Long>{
    
}
