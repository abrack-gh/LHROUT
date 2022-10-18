package com.LHRDepartures.LHROUT.web;

import com.LHRDepartures.LHROUT.entity.Departure;
import com.LHRDepartures.LHROUT.service.DepartureService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class DepartureController {
    private DepartureService departureService;

    @Autowired
    public void setDepartureService(DepartureService departureService){
        this.departureService = departureService;
    }

    @GetMapping("/departure")
    public ResponseEntity<List<Departure>> getAllDeparture(){
        List<Departure> list = departureService.retrieveDeparture();
        return new ResponseEntity<List<Departure>>(list, HttpStatus.OK);
    }

}
