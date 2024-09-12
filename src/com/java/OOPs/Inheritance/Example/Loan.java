package com.java.OOPs.Inheritance.Example;

public class Loan {
    int loan_no;
    double amount;
    double roi;

    Loan(){

    }
    Loan(int loan_no,double amount,double roi){
        this.loan_no=loan_no;
        this.amount=amount;
        this.roi=roi;
    }
    public void displaydetails(){
        System.out.println("Loan Number is: "+loan_no);
        System.out.println("Loan Amount is: "+amount);
        System.out.println("Loan Rate-of-Interest is: "+roi);
    }
}
