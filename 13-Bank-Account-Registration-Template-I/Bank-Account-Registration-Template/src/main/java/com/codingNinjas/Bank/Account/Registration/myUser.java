package com.codingNinjas.Bank.Account.Registration;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

import java.util.ArrayList;


/*
 * 1. Add class attributes.
 * 2. Override all the interface methods.
 * 3. Implement setter injection
 */
@Component("myUser")
public class myUser implements User{

    private String name;

    Account account;
    private List<Account> accounts;

    @Autowired
    @Qualifier("savingsAccount")
    Account savingsAccount;

    @Autowired
    @Qualifier("currentAccount")
    Account currentAccount;

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
    @PostConstruct
    public void init(){
        System.out.println("Bean is going through init.");
    }
    @PreDestroy
    public void destroy(){
        System.out.println("Bean will destroy now.");
    }

    public void setAccount(Account account){
        if(account.equals("savingsAccount")){
            this.account=savingsAccount;
        }
        else{
            this.account=currentAccount;
        }
    }

}
