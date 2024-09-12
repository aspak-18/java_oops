package com.java.OOPs.Polymorphism.runtime.downcasting;

public class Driver {
    public static void main(String[] args) {
        //Upcasting [Reference variable is v]
        Vehicle v=new Bike();
        System.out.println(v.a);
        System.out.println(v.b);
        v.driveVehicle();
        System.out.println("================");
        // Downcasting [reference is b1]
        Bike b1=(Bike) v;
        System.out.println(b1.a);
        System.out.println(b1.b);
        System.out.println(b1.c);
        System.out.println(b1.d);
        System.out.println(b1.e);
        System.out.println(b1.f);
        b1.driveVehicle();
        b1.driveCar();
        b1.rideBike();
        System.out.println("================*************");
        // upcasting [Referencr variable is v1]
        Vehicle v1=new Car();
        System.out.println(v1.a);
        System.out.println(v1.b);
        v1.driveVehicle();
        System.out.println("================");
        // Downcasting [reference is c1]
        Car c1=(Car)v1;
        System.out.println(c1.a);
        System.out.println(c1.b);
        System.out.println(c1.c);
        System.out.println(c1.d);
        c1.driveCar();
        c1.driveVehicle();
        System.out.println("===============**************");
        // upcasting [Referencr variable is c]
        Car c=new Bike();
        System.out.println(c.a);
        System.out.println(c.b);
        System.out.println(c.c);
        System.out.println(c.d);
        c.driveVehicle();
        c.driveCar();
        System.out.println("===============");
        // Downcasting [reference is b2]
        Bike b2=(Bike)c;
        System.out.println(b2.a);
        System.out.println(b2.b);
        System.out.println(b2.c);
        System.out.println(b2.d);
        System.out.println(b2.e);
        System.out.println(b2.f);
        b2.driveVehicle();
        b2.driveCar();
        b2.rideBike();

    }
}
