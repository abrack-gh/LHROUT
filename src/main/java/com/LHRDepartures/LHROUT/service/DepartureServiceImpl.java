package com.LHRDepartures.LHROUT.service;

import com.LHRDepartures.LHROUT.entity.Departure;
import com.LHRDepartures.LHROUT.repository.DepartureRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DepartureServiceImpl implements DepartureService{
    @Autowired
    DepartureRepository departureRepository;

    public List<Departure> retrieveDeparture(){
        return(List<Departure>) departureRepository.findAll();
    }
}
