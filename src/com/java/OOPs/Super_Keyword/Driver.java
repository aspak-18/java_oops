package com.java.OOPs.Super_Keyword;

public class Driver {
    public static void main(String[] args) {
        Car c=new Car();
        Car c1=new Car(10);
        Vehicle v=new Vehicle(15);
        System.out.println(v.a);
        System.out.println(c1.a);
        System.out.println(c.a);
        System.out.println(c.b);
    }
}
