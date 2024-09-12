package com.java.OOPs.ExceptionHandling.TryCatchBlock;

public class Exception3 {
    public static void main(String[] args) {
        int[] a={12,8,0,16,14};
        int n=6;
        /* We can use multiple try-catch block inside a program to catch multiple exception*/
        // try-catch block 1
        try{
            System.out.println(a[n]);
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        //try-catch block 2
        try{
            System.out.println(a[1]/a[2]);
        }catch (ArithmeticException e){
            System.out.println(e.getMessage());
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
