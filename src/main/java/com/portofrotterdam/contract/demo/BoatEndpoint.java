package com.portofrotterdam.contract.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/boats")
public class BoatEndpoint {

    @GetMapping("/{id}")
    public Boat getBoat(@PathVariable final long id) {
        return new Boat(12, "YellowSubmarine", 7);
    }

    @GetMapping("/")
    public List<Boat> getBoats() {
        return List.of(new Boat(12, "YellowSubmarine", 7),
                new Boat(11, "Boorplatform", 20),
                new Boat(3, "Baggerboot", 12));
    }
}