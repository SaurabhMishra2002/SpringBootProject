package com.example.main;

import com.example.beans.Vehicle;
//import com.example.beans.vehicle;
import com.example.config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Example6 {
    public static void main(String[] args) {
//      System.out.println("Hello");

        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);

        Vehicle veh  = context.getBean(Vehicle.class);
        System.out.println("Vehicle name from Spring Context is :"+veh.getName());
        Vehicle.printHello();

        /*
                NoUniqueBeanDefinitionException

                when we create multiple objects of same type and try to fetch the bean from Spring context by type,
                then Spring cannot guess which instance you have declared you refer to. This will lead to NoUniqueBeanDefinitionException.
                As we seen.
         */
    }
}
