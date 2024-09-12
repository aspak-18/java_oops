package com.java.OOPs.ExceptionHandling.TryCatchBlock;

public class Exception4 {
    public static void main(String[] args) {
        int[] a={12,8,0,16,14};
        int n=6;
        try{
            System.out.println(a[n]);
            System.out.println(a[1]/a[2]);
        }
        /* We can declare multiple exception at one catch block using pipeline symbol(|) */
        catch (ArrayIndexOutOfBoundsException | ArithmeticException e){
            System.out.println(e.getMessage());
        }
    }
}
