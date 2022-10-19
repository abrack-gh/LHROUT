package com.LHRDepartures.LHROUT.mutator;

import com.LHRDepartures.LHROUT.model.DepartureRepository;
import com.coxautodev.graphql.tools.GraphQLMutationResolver;


public class Mutation implements GraphQLMutationResolver {
    private DepartureRepository departureRepository;

    public Mutation(DepartureRepository departureRepository){
        this.departureRepository = departureRepository;
    }

    public boolean deleteDeparture(Long ID){
        departureRepository.deleteById(ID);
        return true;
    }
/*
    public Departure updateTerminal(Integer newTerminal, Long Id){
        Optional<Departure> optionalDeparture =
                departureRepository.findById(Id);

        if(optionalDeparture.isPresent()){
            Departure departure = optionalDeparture.get();
          //  departureRepository.setName(newTerminal);
            departureRepository.save(departure);
            return departure;
        } else {
            throw new DepartureNotFoundException("Departure not found!", Id);
        } */
}

