package com.example.beans;


import org.springframework.stereotype.Component;

@Component
public class Vehicle {

        public String getName() {
            return this.name;
        }

        public void setName(String name) {
            this.name = name;
        }


        private String name;

            //Post construct seems to search for beans and then initializes them.

        public void PrintVehicleName (String name){
            this.name = this.getName();
            System.out.println("You chose " + name);


            }

    @Override
    public String toString() {
        return name;
    }


    }

