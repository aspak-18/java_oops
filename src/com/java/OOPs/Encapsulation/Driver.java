package com.java.OOPs.Encapsulation;

public class Driver {
    public static void main(String[] args) {
        Employee e=new Employee();
        e.setId(1);
        e.setName("Ashfaque");
        e.setSalary(35000.0);
        System.out.println(e.getId());
        System.out.println(e.getName());
        System.out.println(e.getSalary());
    }
}
