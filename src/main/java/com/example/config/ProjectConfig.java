package com.example.config;


import com.example.beans.vehicle;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/*
Spring @configuration annotation is part of the Spring core framework
.Spring Configuration annotation indicate that the class has @bean definition
methods.So Spring container can process the class and generate spring Beans
to be used in the application.

*/


@Configuration
public class ProjectConfig {


    /*
        @Bean annotation, which lets Spring know tha it need to call
        this method when it initialization its context and adds
        the returned value to the context.
     */
    @Bean
    vehicle Vehicle1(){
        var veh = new vehicle();
        veh.setName("waqnur 9");
        return veh;
    }

    @Bean
    vehicle Vehicle2(){
        var veh = new vehicle();
        veh.setName("Audi 9");
        return veh;
    }

    @Bean
    vehicle Vehicle3(){
        var veh = new vehicle();
        veh.setName("Skoda 9");
        return veh;
    }



}
