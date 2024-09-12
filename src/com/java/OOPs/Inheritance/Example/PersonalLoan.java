package com.java.OOPs.Inheritance.Example;

public class PersonalLoan extends Loan{
    String name;
    String address;

    PersonalLoan(){

    }
    PersonalLoan(int loan_no,double amount,double roi,String name,String address){
        super(loan_no,amount,roi);
        this.name=name;
        this.address=address;
    }
    public void getDetails(){
        displaydetails();
        System.out.println("Name is: "+name);
        System.out.println("Address is: "+address);
    }
}
