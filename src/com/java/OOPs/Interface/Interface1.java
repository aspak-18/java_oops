package com.java.OOPs.Interface;

public interface Interface1 {
    int x=10;
    public void test();
    public default void add(){
        System.out.println("This  is default method");
        mul();
    }
    private void mul(){
        System.out.println("This is interface private method");
    }
}
