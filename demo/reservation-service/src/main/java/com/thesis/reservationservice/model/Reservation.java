package com.thesis.reservationservice.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.time.LocalDate;

/**
 * @author Barbara Josko (barbara.josko@hycom.pl))
 */
@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Reservation {

    @Id
    @GeneratedValue
    private Long id;

    private Long placeId;

    private Long userId;

    private LocalDate date;

    public Reservation(Long placeId, Long userId, LocalDate date) {
        this.placeId = placeId;
        this.userId = userId;
        this.date = date;
    }
}