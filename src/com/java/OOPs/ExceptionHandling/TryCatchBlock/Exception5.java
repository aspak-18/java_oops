package com.java.OOPs.ExceptionHandling.TryCatchBlock;

public class Exception5 {
    public static void main(String[] args) {
        int[] a={12,8,0,16,14};
        int n=6;
        // We can use one try block inside another try block and such arrangement is called nested try block
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
    }
}
