package com.example.demo.model;

public class TransformProperty {

    public Property toProperty(PropertyDto propertyDto) {
        Property property = new Property();
        return property;
    }

    public PropertyDto toDto(Property property) {
        PropertyDto propertyDto = new PropertyDto();
        return propertyDto;
    }

    public PropertyDetailDto toPropertyDetailDto(Property property) {
        return new PropertyDetailDto();
    }

}