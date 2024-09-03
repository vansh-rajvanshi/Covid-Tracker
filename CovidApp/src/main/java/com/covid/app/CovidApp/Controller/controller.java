package com.covid.app.CovidApp.Controller;

import com.covid.app.CovidApp.Service.CovidDataFetch;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/covid-data")
public class controller {
    @Autowired
    CovidDataFetch covidDataFetch;
    @GetMapping("/citywise/{state}/{city}")
    public String covidData(@PathVariable String state,@PathVariable String city){
        Integer coviddata=covidDataFetch.getData(state,city);
        return "Covid Active Cases in "+city+"="+coviddata;
    }
}
