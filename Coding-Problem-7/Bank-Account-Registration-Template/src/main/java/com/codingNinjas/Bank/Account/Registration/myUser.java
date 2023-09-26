package com.codingNinjas.Bank.Account.Registration;

import java.util.List;
import java.util.ArrayList;


/*
 * 1. Add class attributes.
 * 2. Override all the interface methods.
 * 3. Implement setter injection
 */

public class myUser implements User{

    private String name;
    Account account;
    private List<Account> accounts;

    public void init(){
        System.out.println("User Bean has been instantiated and I'm the init method");
    }

    public void destroy(){
        System.out.println("User Bean has been destroyed and I'm the destroy method");
    }
    public myUser(){
        accounts=new ArrayList<>();
    }
    public void setUserDetails(String name) {
        this.name = name;
    }

    public void addAccount(Account account){
        accounts.add(account);
    }

    public List<Account> getAllAccounts(){
        return accounts;
    }

    public String getName(){
        return name;
    }

}
