package com.example.main;

import com.example.beans.vehicle;
import com.example.config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Example6 {
    public static void main(String[] args) {
//      System.out.println("Hello");

        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);

        vehicle veh  = context.getBean("Vehicle2",vehicle.class);
        System.out.println("Vehicle name from Spring Context is :"+veh.getName());


        /*
                NoUniqueBeanDefinitionException

                when we create multiple objects of same type and try to fetch the bean from Spring context by type,
                then Spring cannot guess which instance you have declared you refer to. This will lead to NoUniqueBeanDefinitionException.
                As we seen.
         */
    }
}
