package com.java.OOPs.Mutable_Immutable.Immutable;
// Steps to create immutable class

/* step-1: We have to declare class as final such that it child creation
           will not be possible and its details cannot be modified by child class*/
public final class Vehicle {
    /* Step-2: We have to declare all its data as final so that once initialized it cannot be changed*/
    /* Step-3: We have to make every data member private so that it will not be visible outside class*/
    private final String name;
    private final int price;
    private final String color;

    /* Step-4: We have to design parameterised constructor where all the final members must be initialized*/
    Vehicle(String name, int price, String color){
        this.name=name;
        this.price=price;
        this.color=color;
    }
    /*Step-5: We have to design only public type getters to get the details of final members*/
    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public String getColor() {
        return color;
    }

}
