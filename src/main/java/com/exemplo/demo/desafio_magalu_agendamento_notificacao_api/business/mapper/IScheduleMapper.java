

 package com.exemplo.demo.desafio_magalu_agendamento_notificacao_api.business.mapper;

import org.mapstruct.Mapper;
import static org.mapstruct.MappingConstants.ComponentModel.SPRING;

import com.exemplo.demo.desafio_magalu_agendamento_notificacao_api.controller.dto.in.ScheduleDTOIn;
import com.exemplo.demo.desafio_magalu_agendamento_notificacao_api.controller.dto.out.ScheduleDTOOut;
import com.exemplo.demo.desafio_magalu_agendamento_notificacao_api.infrastructure.entities.Schedule;

@Mapper(componentModel = SPRING)
 public interface IScheduleMapper {

    Schedule toScheduleEntity(ScheduleDTOIn schedule);

    ScheduleDTOOut toScheduleDTOOut(Schedule schedule);
    
}