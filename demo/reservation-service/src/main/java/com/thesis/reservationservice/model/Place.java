package com.thesis.reservationservice.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * @author Barbara Josko (barbara.josko@hycom.pl))
 */
@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Place {

    @Id
    @GeneratedValue
    private Long id;

    private String placeName;

    private Long spaceId;

    public Place(String placeName, Long spaceId) {
        this.placeName = placeName;
        this.spaceId = spaceId;
    }
}
