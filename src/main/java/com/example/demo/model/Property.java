package com.example.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Property {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String longitude;

    private String latitude;

    private String description;

    private String propertyType;

    private String address;

    private String price;

    private String noBedrooms;

    private String size;

    private String[] images;

}
