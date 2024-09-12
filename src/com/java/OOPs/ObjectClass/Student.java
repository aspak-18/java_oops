package com.java.OOPs.ObjectClass;

public class Student {
    int id;
    String name;

    Student(){

    }
    Student(int id,String name){
        this.id=id;
        this.name=name;
    }
    // toString method of Objet Class
    @Override
    public String toString(){
        return "Id is: "+id+"\nName is: "+name;
    }
    // hashCode method of Objet Class
    @Override
    public int hashCode(){
        return id;
    }
    // equals method of Objet Class
    @Override
    public boolean equals(Object obj){
        Student s1= (Student)obj;
        return this.id==s1.id && this.name.equals(s1.name);
    }
    // finalize method of Objet Class
    @Override
    public void finalize(){
        System.out.println("Resources are closed");
    }


}
