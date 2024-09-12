package com.java.OOPs.Polymorphism.runtime.methodOverridding;

public class College extends University{
    public  void addStudent(){
        System.out.println("Student is added in college");
    }
    public int add(int a,int b){
        return a+b;
    }
}
