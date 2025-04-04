 package com.exemplo.demo.desafio_magalu_agendamento_notificacao_api.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.exemplo.demo.desafio_magalu_agendamento_notificacao_api.business.ScheduleService;
import com.exemplo.demo.desafio_magalu_agendamento_notificacao_api.controller.dto.in.ScheduleDTOIn;
import com.exemplo.demo.desafio_magalu_agendamento_notificacao_api.controller.dto.out.ScheduleDTOOut;

import lombok.RequiredArgsConstructor;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
@RequiredArgsConstructor
@RequestMapping("/schedule")
 public class ScheduleController {

    private final ScheduleService service;

    @PostMapping
    public ResponseEntity<ScheduleDTOOut> saveSchedule(@RequestBody ScheduleDTOIn schedule){
        return ResponseEntity.ok(service.saveSchedule(schedule));
    }
    
    @GetMapping("/{id}")
    public ResponseEntity<ScheduleDTOOut> findScheduleById(@PathVariable("id") Long id) {
        return ResponseEntity.ok(service.findScheduleById(id));
    }
    
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> cancelSchedule(@PathVariable("id") Long id){
        service.cancelSchedule(id);
        return ResponseEntity.accepted().build(); 
    }
}