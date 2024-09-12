package com.java.OOPs.Constructor.Parameterized_Constructor;

public class Vehicle {
    int price;
    String name;
    // User Defined No-argument Constructor
    Vehicle(){
        System.out.println("This is user-defined no-argument constructor");
    }
    Vehicle(int price,String name){
        this.price=price;
        this.name=name;
        System.out.println("This is User-defined Parameterized Constructor");
    }
}
