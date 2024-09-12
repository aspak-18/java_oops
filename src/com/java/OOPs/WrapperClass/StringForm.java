package com.java.OOPs.WrapperClass;

public class StringForm {
    public static void main(String[] args) {
        Object o="mohan";
        System.out.println(o);
        String s=(String)o;
        System.out.println(s.toUpperCase());
        Object o1="18";
        String s2=(String) o1;
        System.out.println(s2.charAt(1));
    }
}
