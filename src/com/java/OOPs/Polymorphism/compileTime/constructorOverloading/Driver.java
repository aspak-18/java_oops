package com.java.OOPs.Polymorphism.compileTime.constructorOverloading;

public class Driver {
    public static void main(String[] args) {
        Addition a=new Addition();
        Addition a1=new Addition(10,20);
        Addition a2=new Addition(10.0,"abcd");
        Addition a3=new Addition(20,20.5,"20 and 20.5");
        Addition a4=new Addition(18,18,"abc","xyz", 18.5,18.5);
    }
}
