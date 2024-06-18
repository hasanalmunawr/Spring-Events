package com.haasanalmunawr.Spring_Event.controller;

import com.haasanalmunawr.Spring_Event.dto.PatientDischargeRequest;
import com.haasanalmunawr.Spring_Event.service.PatientDischargeService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
@RequiredArgsConstructor
public class Controller {

    private final PatientDischargeService service;

    @PostMapping("/process")
    public String dischargePatient(@RequestBody PatientDischargeRequest request) {
        return service.dischargePatient(request.getPatientId(), request.getPatientName());
    }

}
