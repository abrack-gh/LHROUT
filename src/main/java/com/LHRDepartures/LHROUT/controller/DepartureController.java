package com.LHRDepartures.LHROUT.controller;

import com.LHRDepartures.LHROUT.model.Departure;
import com.LHRDepartures.LHROUT.model.DepartureRepository;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

@Controller
public class DepartureController {

    private final DepartureRepository departureRepository;

    public DepartureController(DepartureRepository departureRepository) {
        this.departureRepository = departureRepository;
    }

    @QueryMapping
    public Iterable<Departure> findAllDepartures() {
        return departureRepository.findAll();

    }
}