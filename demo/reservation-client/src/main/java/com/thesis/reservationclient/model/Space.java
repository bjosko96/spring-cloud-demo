package com.thesis.reservationclient.model;

import lombok.Data;

/**
 * @author Barbara Josko (barbara.josko@hycom.pl))
 */
@Data
public class Space {
    private Long id;
    private String spaceName;
    private String spaceDescription;
    private String address;
    private String city;
    private Long companyId;
}
