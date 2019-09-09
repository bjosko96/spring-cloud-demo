package com.thesis.reservationclient.controller;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.thesis.reservationclient.feignclient.ReservationFeignClient;
import com.thesis.reservationclient.model.Place;
import com.thesis.reservationclient.model.Space;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Collection;
import java.util.stream.Collectors;

@RestController
class ReservationApiGateway {

    private final ReservationFeignClient reservationFeignClient;

    public ReservationApiGateway(ReservationFeignClient reservationFeignClient) {
        this.reservationFeignClient = reservationFeignClient;
    }

    public Collection<Space> allSpacesFallback() {
        return new ArrayList<>();
    }

    @HystrixCommand(fallbackMethod = "allSpacesFallback")
    @CrossOrigin(origins = "*")
    @GetMapping("/all-spaces")
    public Collection<Space> allSpaces() {
        return new ArrayList<>(reservationFeignClient.readSpaces()
                .getContent());
    }

    @CrossOrigin(origins = "*")
    @GetMapping("/spaces/{spaceId}/places")
    public Collection<Place> spacePlaces(@PathVariable Long spaceId) {
        return reservationFeignClient.readPlaces().getContent().stream().filter(p -> p.getSpaceId().equals(spaceId))
                .collect(Collectors.toList());
    }

    @CrossOrigin(origins = "*")
    @GetMapping("/spaces/{spaceId}")
    public Space oneSpace(@PathVariable Long spaceId) {
        return reservationFeignClient.readOneSpace(spaceId).getContent();
    }

}
