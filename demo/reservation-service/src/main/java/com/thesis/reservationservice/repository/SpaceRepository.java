package com.thesis.reservationservice.repository;

import com.thesis.reservationservice.model.Space;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

/**
 * @author Barbara Josko (barbara.josko@hycom.pl))
 */
@RepositoryRestResource
public interface SpaceRepository extends JpaRepository<Space, Long> {

}
