package com.example.beans;

import org.springframework.stereotype.Component;

@Component
public class Vehicle {

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }


        private String name;


        public void PrintVehicleName (String name){
            this.name = name;
            System.out.println("You chose " + this.getName());
        }

    }

