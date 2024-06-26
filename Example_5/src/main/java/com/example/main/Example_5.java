package com.example.main;

import com.example.beans.Person;
import com.example.beans.Vehicle;
import com.example.config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Example_5 {
    public static void main(String[] args) {
// This object is not tracked inside the spring context.
        //this line is responsible for initializing  and keeping track of all the beans.


        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);

        Vehicle veh = context.getBean(Vehicle.class);
        Person person  = context.getBean(Person.class);
        veh.setName("Buick");
        veh.PrintVehicleName(veh.getName());
        person.setName("Tom");
        System.out.println( person.getName() + " got a " + person.getVehicle());

        context.close();



        /*
        We don't need to do any explicit casting while fetching a bean from context.
        Spring is smart enough to look for a bean of the type you requested in its context.
        If such a bean doesn't exist, Spring will throw an exception.
        Ex.
         */

    }
}
