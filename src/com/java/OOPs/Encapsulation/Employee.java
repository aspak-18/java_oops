package com.java.OOPs.Encapsulation;

import java.util.Scanner;

public class Employee {
    private int s_pin=1818;
    private int id;
    private String name;
    private double salary;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the pin: ");
        int u_pin=sc.nextInt();
        if (s_pin==u_pin){
            this.id = id;
            System.out.println("Id is set");
        }
        else{
            System.out.println("Invalid Pin");
            System.out.println("Try again");
            setId(id);
        }

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

}
