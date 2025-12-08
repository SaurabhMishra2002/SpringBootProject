package com.example.main;

import com.example.beans.vehicle;
import com.example.config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Example1 {
    public static void main(String[] args) {
//      System.out.println("Hello");

        vehicle vehicle = new vehicle();
        vehicle.setName("Honda city");
        System.out.println("Vehicle name from non spring context is :" +vehicle.getName());

        /*
            The var keyword was introduced in java 10.Type interface is used
            in var keyword in which it detects automatically the datatype of a variable
            based on the surrounding context.
         */

        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);

        vehicle veh  = context.getBean(vehicle.class);
        System.out.println("Vehicle name from Spring Context is :"+veh.getName());

    }
}
