package com.java.OOPs.Inheritance.SingleLevel;

public class Driver {
    public static void main(String[] args) {
        B b=new B();
        System.out.println(b.a);
        System.out.println(b.b);
        System.out.println(b.c);
        System.out.println(b.d);
        b.add(20,20);
        b.mul(5,4);
        System.out.println("================");
        A a=new A();
        System.out.println(a.a);
        System.out.println(a.b);
        a.add(40,50);
    }
}
