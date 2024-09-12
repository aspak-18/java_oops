package com.java.OOPs.Abstraction;

public abstract class Computer {
    static int a;
    int b;
    static{
        a=10;
    }
    {
        b=20;
    }
    Computer(){
        System.out.println("This is no arg-constructor of abstract method");
        System.out.println("Abc");
    }
    Computer(int a,int b){
        Computer.a=a;
        this.b=b;
        System.out.println(add(a,b));
    }
    public static int add(int a,int b){
        return  a+b;
    }
    public void test(){
        System.out.println("This is non-static method of abstract class");
    }
    public abstract void demo();
}
