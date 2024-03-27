
package com.miApp.citiesservice.controller;

import com.miApp.citiesservice.dto.CityDTO;
import com.miApp.citiesservice.service.ICitiesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/cities")
public class CitiesController {
    
    @Autowired
    private ICitiesService servCity;

    @GetMapping("/hotels")
    public CityDTO getCityAndHotels(@RequestParam String name,
                                    @RequestParam String country) {

        return servCity.getCityAndHotels(name, country);

    }
    
}
