package com.codingNinjas.Bank.Account.Registration;

import java.util.List;

/*
 * 1. Add class attributes.
 * 2. Override all the interface methods.
 * 3. Implement setter injection
 */

public class myUser implements User{

    private String name;
    Account account;
    private List<Account> accounts;

    public void setUserDetails(String name) {
        this.name = name;
    }

    public void addAccount(Account account){
        this.account = account;
    }

    public List<Account> getAllAccounts(){
        return accounts;
    }

    public String getName(){
        return name;
    }

}
