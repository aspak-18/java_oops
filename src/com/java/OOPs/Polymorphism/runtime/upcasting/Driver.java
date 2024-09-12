package com.java.OOPs.Polymorphism.runtime.upcasting;

public class Driver {
    public static void main(String[] args) {
        Vehicle v1=new Car();
        Car c=new Bike();
        Bike b=new Cycle();
        Vehicle v=new Cycle();
        Cycle cy=new Cycle();
        System.out.println(Vehicle.a);
        System.out.println(v.b);
        v.driveVehicle();
        System.out.println("==================");
        System.out.println(Car.a);
        System.out.println(c.b);
        System.out.println(c.c);
        System.out.println(Car.d);
        c.driveVehicle();
        c.driveCar();
        System.out.println("===================");
        System.out.println(Bike.a);
        System.out.println(b.b);
        System.out.println(b.c);
        System.out.println(Bike.d);
        System.out.println(b.e);
        System.out.println(b.f);
        b.driveVehicle();
        b.driveCar();
        b.rideBike();
        System.out.println("==================");
        System.out.println(Cycle.a);
        System.out.println(cy.b);
        System.out.println(cy.c);
        System.out.println(Cycle.d);
        System.out.println(cy.e);
        System.out.println(cy.f);
        System.out.println(cy.g);
        System.out.println(cy.h);
        cy.driveVehicle();
        cy.driveCar();
        cy.rideBike();
        cy.rideCycle();
    }
}
