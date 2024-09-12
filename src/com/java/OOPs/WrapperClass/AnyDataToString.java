package com.java.OOPs.WrapperClass;

public class AnyDataToString {
    public static void main(String[] args) {
        // to convert any type of data into string type data using toString() of Wrapper class
        int x=18;
        String s=Integer.toString(x);
        System.out.println(s+100);
        System.out.println("Total digit in "+s+" is: "+s.length());
        double d=15.5;
        String s1=Double.toString(d);
        System.out.println(s1+100);
        System.out.println("Total digit in "+s1+" is: "+(s1.length()-1));
        char c='@';
        String s2=Character.toString(c);
        System.out.println(s2+100);
        System.out.println("Total digit in "+s2+" is: "+s2.length());
        System.out.println("===============================");

        // to convert String data back to its original form
        String n="258";
        int a=Integer.parseInt(n);
        System.out.println(a+1000);
        String m="158.25";
        double d1=Double.parseDouble(m);
        System.out.println(d1+1000);
        String o="@";
        char cha=Character.valueOf(o.charAt(0));
        System.out.println(o+100);

    }
}
