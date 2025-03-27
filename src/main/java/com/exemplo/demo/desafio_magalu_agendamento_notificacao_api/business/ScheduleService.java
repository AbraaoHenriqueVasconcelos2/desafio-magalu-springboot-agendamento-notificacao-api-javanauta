package com.exemplo.demo.desafio_magalu_agendamento_notificacao_api.business;

import org.springframework.stereotype.Service;

import com.exemplo.demo.desafio_magalu_agendamento_notificacao_api.business.mapper.IScheduleMapper;
import com.exemplo.demo.desafio_magalu_agendamento_notificacao_api.controller.dto.in.ScheduleDTOIn;
import com.exemplo.demo.desafio_magalu_agendamento_notificacao_api.controller.dto.out.ScheduleDTOOut;
import com.exemplo.demo.desafio_magalu_agendamento_notificacao_api.infrastructure.repositories.ScheduleRepository;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Service
public class ScheduleService {
    
    private final ScheduleRepository repository;
    private final IScheduleMapper mapper;

    public ScheduleDTOOut saveSchedule(ScheduleDTOIn scheduleDTOIn){
        return mapper.toScheduleDTOOut(
            repository.save(
                mapper.toScheduleEntity(scheduleDTOIn)
            )
        );
    }

    

}
