package com.java.OOPs.ExceptionHandling.FinallyBlock;

import java.util.Scanner;

public class Exception1 {
    public static void main(String[] args) {
        int[] a={12,8,0,16,14};
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the index: ");
        int n=sc.nextInt();
        try {
            System.out.println(a[n]);
            try{
                System.out.println(a[1]/a[2]);
            }catch (ArithmeticException e){
                System.out.println(e.getMessage());
                e.printStackTrace();
            }
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
        finally {
            System.out.println("This is finally block");
            sc.close();
            System.out.println("Resources are closed");
        }
    }
}
