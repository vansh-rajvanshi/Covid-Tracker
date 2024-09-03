package com.covid.app.CovidApp.Config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class configration {
    @Bean
    public RestTemplate getInstance(){
        return  new RestTemplate();
    }
}
