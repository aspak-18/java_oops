package com.java.OOPs.ObjectClass;

public class Driver {
    public static void main(String[] args) {
        Student s = new Student(1, "Aspak");
        System.out.println(s.id);
        System.out.println(s.name);
        System.out.println("=================");
        System.out.println(s.toString());
        System.out.println(s.hashCode());
        System.out.println(s.equals(s));
        s.finalize();
    }
}
