
package com.miApp.citiesservice.dto;

import java.util.List;

public class CityDTO {
    
    private Long city_id;
    private String name;
    private String continent;
    private String country;
    private String state;
    private List<HotelDTO> hotelList;

    public CityDTO() {
    }

    public CityDTO(Long city_id, String name, String continent, String country, String state, List<HotelDTO> hotelList) {
        this.city_id = city_id;
        this.name = name;
        this.continent = continent;
        this.country = country;
        this.state = state;
        this.hotelList = hotelList;
    }

    public Long getCity_id() {
        return city_id;
    }

    public void setCity_id(Long city_id) {
        this.city_id = city_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContinent() {
        return continent;
    }

    public void setContinent(String continent) {
        this.continent = continent;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public List<HotelDTO> getHotelList() {
        return hotelList;
    }

    public void setHotelList(List<HotelDTO> hotelList) {
        this.hotelList = hotelList;
    }
    
    
}
