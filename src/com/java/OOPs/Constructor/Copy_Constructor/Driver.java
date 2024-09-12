package com.java.OOPs.Constructor.Copy_Constructor;

public class Driver {
    public static void main(String[] args) {
        Laptop l=new Laptop("HP",12000,8);
        Laptop l1=new Laptop(l);
        Laptop l2=new Laptop(l1);
        Laptop l3=new Laptop(l2);
        System.out.println(l);
        System.out.println(l1);
        System.out.println(l2);
        System.out.println(l3);
        l.getDetails();
        l1.getDetails();
        l2.getDetails();
        l3.getDetails();
    }
}
