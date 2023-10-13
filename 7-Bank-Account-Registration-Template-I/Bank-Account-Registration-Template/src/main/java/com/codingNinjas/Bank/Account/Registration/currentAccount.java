package com.codingNinjas.Bank.Account.Registration;

import java.util.List;

/*
 * 1. Add class attributes.
 * 2. Override all the interface methods.
 * 3. Implement setter injection
 */

public class currentAccount implements Account{

    private double balance;
//    private String accountType;

    public String getAccountType(){
//        return this.accountType;
        return "Current";
    }

    public void addBalance(double balance){
        this.balance =balance;
    }

    public double getBalance(){
        return balance;
    }
}
