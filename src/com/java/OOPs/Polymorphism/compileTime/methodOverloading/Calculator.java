package com.java.OOPs.Polymorphism.compileTime.methodOverloading;

public class Calculator {
    Calculator(){
        System.out.println("No-arg Constructor");
    }
    public static void add(int a,int b){
        System.out.println("Sum of int and int: "+(a+b));
    }
    public void add(int a,double b){
        System.out.println("Sum of int and double: "+(a+b));
    }
    public String add(double a,double b){
        return "Sum of double and double is:"+(a+b);
    }
}
