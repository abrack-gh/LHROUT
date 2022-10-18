package com.LHRDepartures.LHROUT.resolver;

import com.LHRDepartures.LHROUT.entity.Departure;
import com.LHRDepartures.LHROUT.repository.DepartureRepository;
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
