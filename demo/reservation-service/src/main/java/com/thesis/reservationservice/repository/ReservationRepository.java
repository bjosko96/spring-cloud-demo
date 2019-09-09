package com.thesis.reservationservice.repository;

import com.thesis.reservationservice.model.Reservation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

/**
 * @author Barbara Josko (barbara.josko@hycom.pl))
 */
@RepositoryRestResource
public interface ReservationRepository extends JpaRepository<Reservation, Long> {

}