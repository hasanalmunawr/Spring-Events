package com.haasanalmunawr.Spring_Event.handler;

import com.haasanalmunawr.Spring_Event.event.PatientDischargeEvent;
import org.springframework.context.event.EventListener;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

@Component
public class BillingServiceHandler {

    @EventListener
    @Async
    public void processBillingService(PatientDischargeEvent event) {
        System.out.println("Billing Service = processing billing for : "
                + event.getPatientId() + " : " + Thread.currentThread().getName());
    }
}
