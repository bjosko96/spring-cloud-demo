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
public class Company {

    @Id
    @GeneratedValue
    private Long id;

    private String companyName;

    public Company(String companyName) {
        this.companyName = companyName;
    }
}
