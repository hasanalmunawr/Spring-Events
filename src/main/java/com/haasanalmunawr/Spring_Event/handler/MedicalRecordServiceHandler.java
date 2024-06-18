package com.haasanalmunawr.Spring_Event.handler;

import com.haasanalmunawr.Spring_Event.event.PatientDischargeEvent;
import org.springframework.context.event.EventListener;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

@Component
public class MedicalRecordServiceHandler {

    @EventListener
    @Async
    public void updatePatientHistory(PatientDischargeEvent event) {
        System.out.println("Medical Records Service: Updating records for patient "
                +event.getPatientId()+" : "+Thread.currentThread().getName());

    }
}
