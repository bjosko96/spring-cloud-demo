package com.thesis.reservationclient.model;

import lombok.Data;

/**
 * @author Barbara Josko (barbara.josko@hycom.pl))
 */
@Data
public class Place {
    private Long id;
    private String placeName;
    private Long spaceId;
}
