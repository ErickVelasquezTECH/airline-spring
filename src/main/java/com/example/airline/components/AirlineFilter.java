package com.example.airline.components;

import com.example.airline.model.Airline;
import com.example.airline.model.Flight;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class AirlineFilter {

    public List<Flight> filterByOrigin(Airline airline, String origin) {
        return airline.flights().stream()
                .filter(f -> f.origin().equalsIgnoreCase(origin))
                .toList();
    }
}
