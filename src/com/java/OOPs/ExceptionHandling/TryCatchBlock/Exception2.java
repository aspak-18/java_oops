package com.java.OOPs.ExceptionHandling.TryCatchBlock;

public class Exception2 {
    public static void main(String[] args) {
        int[] a={12,8,0,16,14};
        int n=4;
        try{
            System.out.println(a[n]);
            System.out.println(a[1]/a[2]);
            /* Once exception occured at try block then any statement written inside try block
            will not get executed as control will be given directly to the catch block.*/
            System.out.println("Exception");
        }
        //we can use multiple catch block with one try block to catch multiple array
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println(e.getMessage());
        }catch (ArithmeticException e){
            System.out.println(e.getMessage());
        }
    }
}
