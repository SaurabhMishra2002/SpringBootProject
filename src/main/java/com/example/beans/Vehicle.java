package com.example.beans;

//import javax.annotation.PostConstruct;

//import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Component;

@Component
public class Vehicle implements Vehicles {  // Class name starts with uppercase

    private String name;

    // Default constructor
    public Vehicle() {
        System.out.println("Vehicle constructor called");
    }

    // Getter
    public String getName() {
        return name;
    }

    // Setter
    public void setName(String name) {
        this.name = name;
    }
    
    @PreDestroy

    // This method will run after the bean is initialized
    @PostConstruct
    public void initialize() {
        this.name = "Honda";
        //System.out.println("Vehicle bean initialized with name: " + name);
    }

    // Static method
    public static void printHello() {
        System.out.println("Printing Hello from Vehicle bean");
    }
}
