package com.java.OOPs.Mutable_Immutable.Mutable;

public class Mutable {
    int price;
    String name;
    String color;

    Mutable(){

    }
    Mutable(String name, int price, String color){
        this.name=name;
        this.price=price;
        this.color=color;
    }
    public void display(){
        System.out.println("Name is:"+name);
        System.out.println("Price is:"+price);
        System.out.println("Color is:"+color);
    }
}
