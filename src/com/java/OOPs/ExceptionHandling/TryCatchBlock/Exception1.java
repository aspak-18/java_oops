package com.java.OOPs.ExceptionHandling.TryCatchBlock;

public class Exception1 {
    public static void main(String[] args) {
        int[] a={12,8,0,16,14};
        int n=6;
        // we can throw only one exception from try block at a time.
        // We cannot throw multiple exception from try block at a time
        try{
            System.out.println(a[n]);
            System.out.println(a[1]/a[2]);
        }
        // we cannot write any statement between try and catch block as it will give compilation error
        //System.out.println("Exception"); // Error
        catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
