package com.java.OOPs.Interface;

//import static com.java.OOPs.Interface.Interface1.x;

public class Class1 extends Class2 implements Interface1,Interface2{

    public Class1(int i, int i1) {
        super(i,i1);
    }

    @Override
    public void test() {
        System.out.println("This is test method");
    }
    public void getX(){
        System.out.println(x);
    }

    @Override
    public void demo() {
        System.out.println("This is demo method");
    }

    @Override
    public void demo2() {
        System.out.println("This is Interface2 demo method");
    }
}
