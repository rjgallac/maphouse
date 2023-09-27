package com.example.demo.service;

import com.example.demo.model.Property;
import com.example.demo.repository.PropertyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PropertyService {

    @Autowired
    private PropertyRepository propertyRepository;


    public Iterable<Property> getProperties() {
        return propertyRepository.findAll();
    }
}
