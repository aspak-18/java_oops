package com.java.OOPs.Final;

public final class Fruit {
    final int a;
    final static int b;
    int d;
    static{
        b=5;
    }
    // final non-static variable must be initialize from every consturctor
//    Fruit(){
//
//    }
    Fruit(int a){
        this.a=a;
    }
    public void eat(){
        final int c=18;
        System.out.println(d);
        System.out.println(c);
//        c=20; //final local variable once initialized cannot be changed later
    }
}
