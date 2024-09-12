package com.java.OOPs.Abstraction;

public class Driver {
    public static void main(String[] args) {
        Laptop l=new Laptop();
        Laptop l2=new Laptop(30,40);
        Computer c=new Laptop();
        System.out.println(Computer.a);
        System.out.println(l.b);
        System.out.println(l2.b);
        c.demo();
        l.test();
    }
}
