package com.java.OOPs.InstanceOf_keyword;

public class Driver {
    public static void main(String[] args) {
        Vehicle v1=new Car();
        Vehicle v2=new Bus();
        Vehicle v3=new Bike();
        if (v1 instanceof Car){
            System.out.println("v1 holds the instance or object of car");
        }
        else if(v1 instanceof Bike){
            System.out.println("v1 holds the instance or object of Bike");
        }
        else if(v1 instanceof Bus){
            System.out.println("v1 holds the instance or object of Bus");
        }
        else {
            System.out.println("v1 does not hold any object");
        }
        if (v2 instanceof Bus){
            System.out.println("v2 holds the instance or object of Bus");
        }
        else if (v2 instanceof Car){
            System.out.println("v2 holds the instance or object of Car");
        }
        else if(v2 instanceof  Bike){
            System.out.println("v2 holds the instance or object of Bike");
        }
        if (v3 instanceof Bus){
            System.out.println("v3 holds the instance or object of Bus");
        }
        else if (v3 instanceof Car){
            System.out.println("v3 holds the instance or object of Car");
        }
        else if(v3 instanceof  Bike){
            System.out.println("v3 holds the instance or object of Bike");
        }
    }
}
