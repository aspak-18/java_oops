package com.java.OOPs.Polymorphism.runtime.methodOverridding;

public class Driver {
    public static void main(String[] args) {
        University u=new School();
        University u1=new College();
        College c=new School();
        u.addStudent();
        System.out.println(u.add(10,20));
        u1.addStudent();
        System.out.println(u1.add(20,30));
        c.addStudent();
        System.out.println(c.add(50,50));
    }
}
