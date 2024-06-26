package com.example.config;

import com.example.beans.Vehicle;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import java.util.Random;

/*
Spring @Configuration annotation is part of the Spring Core framework.
Spring Configuration annotation indicates that the class has been definition
methods. So Spring container can process the class and generate Spring Beans to be
used in the application.
 */
@Configuration
public class ProjectConfig {

    @Bean("Stylish")
    Vehicle vehicle(){
        var veh = new Vehicle();
        veh.setName("Audi 8");
        return veh;
    }
    @Bean("Rich")
    Vehicle vehicle_2(){
        var veh = new Vehicle();
        veh.setName("Buick");
        return veh;
    }
    @Primary
    @Bean("FastCars")
    Vehicle vehicle_3(){
        var veh = new Vehicle();
        veh.setName("Ferrari");
        return veh;
    }

    @Bean("Rich")
    Vehicle vehicle_4(){
        var veh = new Vehicle();
        veh.setName("Mercedes");
        return veh;
    }

}

