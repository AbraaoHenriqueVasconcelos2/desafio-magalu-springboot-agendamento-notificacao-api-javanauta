package com.exemplo.demo.desafio_magalu_agendamento_notificacao_api.business;

import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.time.LocalDateTime;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MockMvcBuilder;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;


import com.exemplo.demo.desafio_magalu_agendamento_notificacao_api.business.ScheduleService;
import com.exemplo.demo.desafio_magalu_agendamento_notificacao_api.controller.dto.in.ScheduleDTOIn;
import com.exemplo.demo.desafio_magalu_agendamento_notificacao_api.controller.dto.out.ScheduleDTOOut;
import com.exemplo.demo.desafio_magalu_agendamento_notificacao_api.infrastructure.entities.Schedule;
import com.exemplo.demo.desafio_magalu_agendamento_notificacao_api.infrastructure.entities.enums.StatusNotificationEnum;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;

import com.exemplo.demo.desafio_magalu_agendamento_notificacao_api.business.mapper.IScheduleMapper;
import com.exemplo.demo.desafio_magalu_agendamento_notificacao_api.infrastructure.repositories.ScheduleRepository;


@ExtendWith(MockitoExtension.class)
public class ScheduleServiceTest {
    
    @InjectMocks
    private ScheduleService scheduleService;

    @Mock
    private   ScheduleRepository repository;

    @Mock
    private IScheduleMapper mapper;
    
    private Schedule scheduleEntity;
    private ScheduleDTOIn dtoIn;
    private ScheduleDTOOut dtoOut;

    @BeforeEach
    void setUp(){
        scheduleEntity = new Schedule(1L, "email@email.com", "12988324567", LocalDateTime.of(2025, 4, 1, 21, 11, 10), LocalDateTime.now(), null, "Message Here", StatusNotificationEnum.SCHEDULED);
        dtoIn = new ScheduleDTOIn("email@email.com","12988324567",    "Message Here", LocalDateTime.of(2025, 4, 01, 21, 11, 10));
        dtoOut = new ScheduleDTOOut(1L, "email@email.com", "12988324567", "Message Here", LocalDateTime.of(2025, 4, 1, 21, 11, 10), StatusNotificationEnum.SCHEDULED);
    }

    @Test
    void saveSchedule(){
        when(mapper.toScheduleEntity(dtoIn)).thenReturn(scheduleEntity);
        when(repository.save(scheduleEntity)).thenReturn(scheduleEntity);
        when(mapper.toScheduleDTOOut(scheduleEntity)).thenReturn(dtoOut);
    }

}
