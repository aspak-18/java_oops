package com.java.OOPs.SingletonClass;

public class Driver {
    public static void main(String[] args) {
        Laptop l1=Laptop.getInstance();
        Laptop l2=Laptop.getInstance();
        Laptop l3=Laptop.getInstance();
        System.out.println(l1);
        System.out.println(l2);
        System.out.println(l3);
    }
}
