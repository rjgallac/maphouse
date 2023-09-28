package com.example.demo.controller;

import com.example.demo.model.PropertyDto;
import com.example.demo.service.PropertyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/property")
public class PropertyController {

    @Autowired
    private PropertyService propertyService;

    @GetMapping
    public List<PropertyDto> get(){
        return propertyService.getProperties();
    }

    @GetMapping("/{id}")
    public ResponseEntity<PropertyDto> getProperty(@PathVariable Long id) {
        Optional<PropertyDto> property = propertyService.getProperty(id);
        if(property.isPresent()) {
            return ResponseEntity.ok(property.get());
        }
        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }


    @PostMapping
    public void post(@RequestBody PropertyDto propertyDto){
        propertyService.addProperty(propertyDto);
    }

    @DeleteMapping("/{id}")
    public void deleteProperty(@PathVariable Long id) {
        propertyService.deleteProperty(id);


    }

}
