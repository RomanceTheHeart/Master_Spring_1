package com.example.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/*
Spring @Configuration annotation is part of the Spring Core framework.
Spring Configuration annotation indicates that the class has been definition
methods. So Spring container can process the class and generate Spring Beans to be
used in the application.
 */
@Configuration
@ComponentScan(basePackages = "com.example.beans")
public class ProjectConfig {

 /*   @Bean()
    @Primary
    Vehicle vehicle(){
        var veh = new Vehicle();
        veh.setName("Audi 8");
        return veh;
    }
*/

/*    @Bean
    public Person person(){
        Person person = new Person();
        person.setName("Tom");
        person.setVehicle(vehicle());
        return person;
    }*/

}

