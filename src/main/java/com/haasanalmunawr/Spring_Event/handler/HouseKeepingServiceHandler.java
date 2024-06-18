package com.haasanalmunawr.Spring_Event.handler;

import com.haasanalmunawr.Spring_Event.event.PatientDischargeEvent;
import org.springframework.context.event.EventListener;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

@Component
public class HouseKeepingServiceHandler {

    @EventListener
    @Async
    public void cleanAndAssign(PatientDischargeEvent event) {
        System.out.println("Housekeeping Service: Preparing room for next patient after discharge of "
                +event.getPatientName()+" : "+Thread.currentThread().getName());

    }
}
