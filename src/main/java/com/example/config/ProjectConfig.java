package com.example.config;

import com.example.beans.vehicle;
import org.springframework.context.annotation.Bean;

public class ProjectConfig {
    @Bean
    vehicle Vehicle1(){
        var veh = new vehicle();
        veh.setName("waqnur 9");
        return veh;
    }
}
