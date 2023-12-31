package com.example.demo.model;

import org.springframework.stereotype.Component;

@Component
public class TransformProperty {

    public Property toProperty(PropertyDto propertyDto) {
        return Property.builder()
                .address(propertyDto.getAddress())
                .build();
    }

    public PropertyDto toDto(Property property) {
        return PropertyDto.builder()
                .id(property.getId())
                .address(property.getAddress())
                .build();
    }

    public PropertyDto toPropertyDetailDto(Property property) {
        return PropertyDto.builder()
                .id(property.getId())
                .address(property.getAddress())
                .build();
    }

}
