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
public class Space {

    @Id
    @GeneratedValue
    private Long id;

    private String spaceName;

    private String spaceDescription;

    private String address;

    private String city;

    private Long companyId;

    public Space(String spaceName, String spaceDescription, String address, String city, Long companyId) {
        this.spaceName = spaceName;
        this.spaceDescription = spaceDescription;
        this.address = address;
        this.city = city;
        this.companyId = companyId;
    }
}
