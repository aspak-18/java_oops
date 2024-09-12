package com.java.OOPs.Constructor.Copy_Constructor;

public class Laptop {
    String name;
    int price;
    int ram;

    Laptop(String name,int price,int ram){
        this.name=name;
        this.price=price;
        this.ram=ram;
    }
    Laptop(Laptop l){
        this.name=l.name;
        this.price=l.price;
        this.ram=l.ram;
    }
    public void  getDetails(){
        System.out.println("Name is: "+name);
        System.out.println("Price is is: "+price);
        System.out.println("RAM is: "+ram);
    }
}
