package com.java.OOPs.Constructor.Constructor_Chaining;

public class Laptop {
    String name;
    int price;
    String color;
    Laptop(){
        this("ab");
        System.out.println("no-arg constructor");
    }
    Laptop(String name){
        this(30000);
        this.name=name;
        System.out.println("parameterized constructor single argument");
    }
    Laptop(String name,int price,String color){
        this.price=price;
        this.color=color;
        System.out.println("parameterized constructor three argument");
    }
    Laptop(int  price){
        this("xyz",150000,"black");
        this.price=price;
        System.out.println("single argument");
    }
}
