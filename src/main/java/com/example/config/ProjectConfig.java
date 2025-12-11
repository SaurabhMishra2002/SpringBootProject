package com.example.config;

import com.example.beans.Vehicle;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.example.beans")
public class ProjectConfig {

    private String name;

    @Bean(initMethod = "initialize")
    public Vehicle vehicle() {
        return new Vehicle();
    }

    public void initialize() {
        this.name = "Honda";
    }

}
