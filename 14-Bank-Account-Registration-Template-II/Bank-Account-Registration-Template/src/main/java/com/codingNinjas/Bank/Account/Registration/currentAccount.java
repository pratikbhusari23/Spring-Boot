package com.codingNinjas.Bank.Account.Registration;

import java.util.List;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("currentAccount")
@Scope("prototype")
public class currentAccount implements Account{

    private double balance;

    public String getAccountType(){
        return "Current";
    }

    public void addBalance(double balance){
        this.balance =balance;
    }

    public double getBalance(){
        return balance;
    }
}
