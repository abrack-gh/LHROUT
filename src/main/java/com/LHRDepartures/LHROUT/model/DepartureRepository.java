package com.LHRDepartures.LHROUT.model;

import com.LHRDepartures.LHROUT.model.Departure;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DepartureRepository extends JpaRepository<Departure, Long> {
}