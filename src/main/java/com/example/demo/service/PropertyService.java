package com.example.demo.service;

import com.example.demo.model.Property;
import com.example.demo.model.PropertyDetailDto;
import com.example.demo.model.PropertyDto;
import com.example.demo.model.TransformProperty;
import com.example.demo.repository.PropertyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class PropertyService {

    @Autowired
    private PropertyRepository propertyRepository;

    @Autowired
    private TransformProperty transformProperty;

    public List<PropertyDto> getProperties() {
        Iterable<Property> properties = propertyRepository.findAll();
        List<PropertyDto> propertyDtos = new ArrayList<>();
        for (Property property : properties) {
            propertyDtos.add(transformProperty.toDto(property));
        }
        return propertyDtos;
    }

    public void addProperty(PropertyDto propertyDto) {
        Property property = transformProperty.toProperty(propertyDto);
        propertyRepository.save(property);
    }

    public void deleteProperty(Long id) {
        propertyRepository.deleteById(id);
    }

    public Optional<PropertyDetailDto> getProperty(Long id) {
        Optional<Property> byId = propertyRepository.findById(id);
        if(byId.isPresent()) {
            return Optional.of(transformProperty.toPropertyDetailDto(byId.get()));
        }

        return Optional.empty();
    }
}
