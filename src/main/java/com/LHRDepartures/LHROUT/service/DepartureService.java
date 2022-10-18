package com.LHRDepartures.LHROUT.service;

import com.LHRDepartures.LHROUT.entity.Departure;
import org.springframework.stereotype.Service;

import java.util.List;

public interface DepartureService {
    List<Departure> retrieveDeparture();
}
