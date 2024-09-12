package com.java.OOPs.Abstraction;

public class Laptop extends Computer{

    @Override
    public void demo() {
        System.out.println("This is the body of abstract method");
    }
    Laptop(){

    }
    Laptop(int a, int b){
        super(a,b);
    }
}
