package com.java.OOPs.Super_Keyword;

public class Car extends Vehicle{
    int b;
    Car(){
        super();
        System.out.println("no-arg constructor of car class");
    }
    Car(int b){
        super(b);
        System.out.println("Parameterized constructor of car class");
    }
}
