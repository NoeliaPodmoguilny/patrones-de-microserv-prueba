package com.miApp.citiesservice.repository;

import com.miApp.citiesservice.dto.HotelDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;
import org.springframework.stereotype.Repository;

//mismo nombre de la app en eureka
//asi ya no es necessario configurar la url
@Repository
@FeignClient(name = "hotelsservice")
public interface IHotelAPI {

    @GetMapping("hotels/{city_id}")
    public List<HotelDTO> getHotelsByCityId(@PathVariable("city_id") Long city_id);

}
