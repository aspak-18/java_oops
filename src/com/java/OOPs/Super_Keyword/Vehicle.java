package com.java.OOPs.Super_Keyword;

public class Vehicle {
    int a;
    Vehicle(){
        System.out.println("No-arg constructor of vehicle class");
    }
    Vehicle(int a){
        this.a=a;
        System.out.println("Parameterized constructor of vehicle class");
    }
}
