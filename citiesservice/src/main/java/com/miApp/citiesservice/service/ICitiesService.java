
package com.miApp.citiesservice.service;

import com.miApp.citiesservice.dto.CityDTO;


public interface ICitiesService {
    
    public CityDTO getCityAndHotels(String name, String country);
}
