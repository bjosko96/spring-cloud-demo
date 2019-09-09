package com.thesis.reservationclient.model;

import lombok.Data;

import java.time.LocalDate;

/**
 * @author Barbara Josko (barbara.josko@hycom.pl))
 */
@Data
public class Reservation {
    private Long id;
    private Long placeId;
    private Long userId;
    private LocalDate date;
}