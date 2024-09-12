package com.java.OOPs.Inheritance.Example;

public class Driver {
    public static void main(String[] args) {
        PersonalLoan p=new PersonalLoan(101,100000.0,4.2,"Manzil","Noida");
        p.displaydetails();
        System.out.println("=========================");
        p.getDetails();
    }
}
