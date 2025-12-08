package com.example.beans;


import org.springframework.stereotype.Component;

@Component
public class vehicle {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void initialize(){
        this.name = "Honda";
    }

    public void printHello(){
        System.out.println("Printing Hello from component Vehicle Bean");
    }
}
