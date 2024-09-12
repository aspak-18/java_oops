package com.java.OOPs.ExceptionHandling.Throws;

import java.sql.SQLException;
import java.util.Scanner;

public class Exception1 {
    public static void arrayOperation(int n) throws ArrayIndexOutOfBoundsException,ArithmeticException,Exception{
        int[] a={12,10,0,16,14};
        System.out.println(a[n]);
        System.out.println(a[1]/a[2]);
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the index of array: ");
        int n=sc.nextInt();
        // Exception thrown by using throws at he time of method design must be handled using try-catch during method call
        try{
            arrayOperation(n);
        }catch (ArrayIndexOutOfBoundsException | ArithmeticException e){
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        finally {
            sc.close();
            System.out.println("Resources are closed");
        }
    }
}
