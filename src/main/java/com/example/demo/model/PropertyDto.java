package com.example.demo.model;

import lombok.Builder;
import lombok.Getter;

@Builder
@Getter
public class PropertyDto {

    private Long id;

    private String longitude;

    private String latitude;

    private String description;

    private String propertyType;

    private String address;

    private String price;

    private String noBedrooms;

}
