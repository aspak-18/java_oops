package com.java.OOPs.this_keyword;

public class Student {
    int id;
    String name;
    Student(){

    }
    Student(int id,String name){
        this.id=id;
        this.name=name;
    }
    public void display(){
        System.out.println(this.id);
        System.out.println(this.name);
    }
}
