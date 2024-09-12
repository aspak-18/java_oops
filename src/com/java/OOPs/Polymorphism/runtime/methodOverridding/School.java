package com.java.OOPs.Polymorphism.runtime.methodOverridding;

public class School extends College{
    public  void addStudent(){
        System.out.println("Student is added in school");
    }
    public int add(int a,int b){
        return a+b;
    }
}
