package com.LHRDepartures.LHROUT.service;

import com.LHRDepartures.LHROUT.model.Departure;
import com.LHRDepartures.LHROUT.model.DepartureRepository;
import org.springframework.stereotype.Component;

@Component
public class Query {
    private DepartureRepository departureRepository;

    public Query(DepartureRepository departureRepository){
        this.departureRepository = departureRepository;
    }

    public Iterable<Departure> findAllDepartures() {
        return departureRepository.findAll();
    }
}
