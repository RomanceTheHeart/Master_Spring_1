package com.example.beans;


import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
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

            //Post construct seems to search for beans and then initializes them.
        @PostConstruct
        public void initialize(){if (this.getName() != null) System.out.println("Creating " + this.getName());}

        @PreDestroy
        public void Destroy(){
            if (this.getName() != null) System.out.println(this.getName() + " was destroyed!");
        }

        public void PrintVehicleName (String name){
            this.name = this.getName();
            System.out.println("You chose " + name);



        }


    }

