package com.LHRDepartures.LHROUT.service;

import com.LHRDepartures.LHROUT.model.Departure;
import com.LHRDepartures.LHROUT.model.DepartureRepository;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

@Component
public class InitializingBean implements ApplicationListener<ContextRefreshedEvent> {
    private final DepartureRepository departureRepository;

    public InitializingBean(DepartureRepository departureRepository) {
        this.departureRepository = departureRepository;
    }

    @Override
    public void onApplicationEvent(ContextRefreshedEvent event) {
        Departure departure = new Departure(1L, "MAN", 10.00f, "British Airways", "BOEING", "737", "5");
        Departure departure2 = new Departure(2L, "JFK", 10.30f, "Virgin Atlantic", "AIRBUS", "A350", "2");
        Departure departure3 = new Departure(3L, "LAX", 13.00f, "American Airlines", "BOEING", "777", "3");
        departureRepository.save(departure);

    }
}