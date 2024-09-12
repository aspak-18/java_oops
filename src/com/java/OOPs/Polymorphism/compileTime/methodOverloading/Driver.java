package com.java.OOPs.Polymorphism.compileTime.methodOverloading;

public class Driver {
    public static void main(String[] args) {
        Calculator.add(10,10);
        Calculator c=new Calculator();
        c.add(10,10.5);
        System.out.println(c.add(18.5,18.5));
    }
}
