package com.example.demo.model;

import lombok.Builder;

@Builder
public class PropertyDto {

    private String longitude;

    private String latitude;

    private String description;

    private String propertyType;

    private String address;

    private String price;

    private String noBedrooms;

    public String getLongitude() {
        return longitude;
    }

    public void setLongitude(String longitude) {
        this.longitude = longitude;
    }

    public String getLatitude() {
        return latitude;
    }

    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getPropertyType() {
        return propertyType;
    }

    public void setPropertyType(String propertyType) {
        this.propertyType = propertyType;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getNoBedrooms() {
        return noBedrooms;
    }

    public void setNoBedrooms(String noBedrooms) {
        this.noBedrooms = noBedrooms;
    }
}
