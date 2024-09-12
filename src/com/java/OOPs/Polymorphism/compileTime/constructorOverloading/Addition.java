package com.java.OOPs.Polymorphism.compileTime.constructorOverloading;

public class Addition {
    int a;
    int x;
    String b;
    String y;
    double c;
    double z;

    Addition(){
        System.out.println("This is no-arg Constructor");
    }
    // Constructor Overloading by changing the number of argument
    Addition(int a,int x){
        this.a=a;
        this.x=x;
        System.out.println("Constructor Overloading by changing the number of argument");
    }
    // Constructor Overloading by changing the datatype of argument
    Addition(double c, String b){
        this.c=c;
        this.b=b;
        System.out.println("Constructor Overloading by changing the datatype of argument");
    }
    // Constructor Overloading by changing the sequence of argument
    Addition(int a,double b,String y){
        this.a=a;
        this.c=b;
        this.y=y;
        System.out.println("Constructor Overloading by changing the sequence of argument");
    }
    Addition(int a,int x,String b,String y,double c,double z){
        this.a=a;
        this.x=x;
        this.b=b;
        this.y=y;
        this.c=c;
        this.z=z;
        System.out.println("This is an example of Constructor Overloading");
    }
}
