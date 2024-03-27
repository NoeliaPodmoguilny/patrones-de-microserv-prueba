
package com.miApp.hotelsservice.service;


import com.miApp.hotelsservice.model.Hotel;
import java.util.List;

public interface IHotelService {
    
        public List<Hotel> getHotelsByCityId (Long city_id);
    
}
