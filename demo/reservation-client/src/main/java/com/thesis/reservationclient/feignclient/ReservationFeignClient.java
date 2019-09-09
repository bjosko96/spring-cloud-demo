package com.thesis.reservationclient.feignclient;

import com.thesis.reservationclient.model.Place;
import com.thesis.reservationclient.model.Reservation;
import com.thesis.reservationclient.model.Space;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.hateoas.Resource;
import org.springframework.hateoas.Resources;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @author Barbara Josko (barbara.josko@hycom.pl))
 */
@FeignClient("reservation-service")
public interface ReservationFeignClient {

    @GetMapping("/spaces")
    Resources<Space> readSpaces();

    @GetMapping("/spaces/{spaceId}/places")
    Resources<Place> readSpacePlaces(@PathVariable Long spaceId);

    @GetMapping("/places")
    Resources<Place> readPlaces();

    @GetMapping("/spaces/{spaceId}")
    Resource<Space> readOneSpace(@PathVariable Long spaceId);

    @GetMapping("/reservations")
    Resources<Reservation> readReservations();
}
