package com.covid.app.CovidApp.Service;

import com.covid.app.CovidApp.utility.util;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Map;

@Service
public class CovidDataFetch {
    @Autowired
    RestTemplate restTemplate;

    public Integer getData(String state,String cityname){
        Map<String, Object> data = restTemplate.getForObject(util.COVID_DATA_FETCH, Map.class);
        Map<String,Object>statedata=(Map<String,Object>)data.get(state);
        Map<String,Object>districtdata=(Map<String,Object>)statedata.get("districtData");
        Map<String,Object>citydata=(Map<String,Object>)districtdata.get(cityname);
        Integer result=(Integer) citydata.get("active");
        return result;
    }
}
