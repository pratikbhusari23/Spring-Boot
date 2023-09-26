package com.codingNinjas.Bank.Account.Registration;

/*
 * 1. Add class attributes.
 * 2. Override all the interface methods.
 * 3. Implement setter injection
 */

public class savingsAccount implements Account{

    private double balance; 

    public void init(){
        System.out.println("Savings Account Bean has been created and I'm the init method");
    }
    
    public String getAccountType(){
        return "Savings";
    }

    public void addBalance(double balance){
        this.balance =balance;
    }

    public double getBalance(){
        return balance;
    }

}
