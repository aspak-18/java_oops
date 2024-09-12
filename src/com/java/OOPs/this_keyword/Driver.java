package com.java.OOPs.this_keyword;

public class Driver {

    public static void main(String[] args) {
        Student s1=new Student();
        s1.display();
        Student s=new Student(10,"Ashfaque");
        System.out.println(s);
        s.display();
    }
}
