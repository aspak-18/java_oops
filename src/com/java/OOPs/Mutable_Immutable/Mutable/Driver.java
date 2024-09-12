package com.java.OOPs.Mutable_Immutable.Mutable;

public class Driver {
    public static void main(String[] args) {
        Mutable m=new Mutable("HP",35000,"Gray");
        m.display();
        System.out.println("=======================");
        // object details can be changed multiple times. So it is a mutable class
        m.name="Dell";
        m.price=150000;
        m.color="black";
        m.display();
    }
}
