package com.java.OOPs.Inheritance.MultiLevel;

public class Driver {
    public static void main(String[] args) {
        C c=new C();
        System.out.println(c.a);
        System.out.println(c.b);
        System.out.println(c.c);
        System.out.println(c.d);
        System.out.println(c.e);
        System.out.println(c.f);
        c.add(5,5);
        c.mul(5,5);
        c.sub(5,5);
        System.out.println("==============");
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
