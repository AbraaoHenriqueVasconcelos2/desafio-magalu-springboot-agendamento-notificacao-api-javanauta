 package com.exemplo.demo.desafio_magalu_agendamento_notificacao_api.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.exemplo.demo.desafio_magalu_agendamento_notificacao_api.business.ScheduleService;
import com.exemplo.demo.desafio_magalu_agendamento_notificacao_api.controller.dto.in.ScheduleDTOIn;
import com.exemplo.demo.desafio_magalu_agendamento_notificacao_api.controller.dto.out.ScheduleDTOOut;

import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
@RequestMapping("/schedule")
 public class ScheduleController {

    private final ScheduleService service;

    public ResponseEntity<ScheduleDTOOut> saveSchedule(@RequestBody ScheduleDTOIn schedule){
        return ResponseEntity.ok(service.saveSchedule(schedule));
    }
    
}