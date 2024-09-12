package com.java.OOPs.ExceptionHandling.Throws;

import java.util.Scanner;

public class throw_keyword {
    public static void validateAge(int age) throws Exception {
        if (age<18){
            throw new Exception("Age must be above 18");
        }
        else
            System.out.println("Age is valid");
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the age:");
        int age=sc.nextInt();
        try {
            validateAge(age);
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
        finally {
            sc.close();
            System.out.println("Resources are closed");
        }
    }
}
