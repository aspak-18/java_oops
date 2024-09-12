package com.java.OOPs.Mutable_Immutable.Immutable;

public class Driver {
    public static void main(String[] args) {
        Vehicle v=new Vehicle("TATA",1000000,"Black");
        System.out.println(v.getName());
        System.out.println(v.getPrice());
        System.out.println(v.getColor());
        System.out.println("==================");
//        v.name="ahfaj";// ERROR
    }
}
