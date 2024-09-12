package com.java.OOPs.Interface;

public abstract class Class2 {
    int a;
    int b;
    Class2(){
        System.out.println("This is no arg-constuctor of Abstract class");
    }
    Class2(int a,int b){
        this.a=a;
        this.b=b;
    }
    public abstract void demo();
}
