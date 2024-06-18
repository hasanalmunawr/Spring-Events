package com.haasanalmunawr.Spring_Event.service;

import com.haasanalmunawr.Spring_Event.event.PatientDischargeEvent;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class PatientDischargeService {

    @Autowired
    private ApplicationEventPublisher applicationEventPublisher;

    public String dischargePatient(String patientId, String patientName) {
        log.info("patient discharge started process : {}", patientName);

        applicationEventPublisher.publishEvent(new PatientDischargeEvent(this, patientId, patientName));

        log.info("patient discharge process completed {} ", patientName);
        return "Patient " + patientName + " with ID " + patientId + " discharged successfully!";

    }
}
