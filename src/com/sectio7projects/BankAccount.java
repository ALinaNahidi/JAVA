package com.sectio7projects;

public class BankAccount {
    private String owner;
    private int balance;



    public BankAccount(String owner) {
        this(owner,0);
    }

    public BankAccount(String owner, int balance) {
        this.owner = owner;
        if (balance<=0)
            System.out.println("Balance must be greater than 0");
        else
            this.balance = balance;
    }

    public void deposit(int amount){
        if (amount>0){
            balance+=amount;
        }
        else
            System.out.println("Amount must be greater than 0");
    }

    public void withdraw(int amount){
        if (balance>amount){
            balance-=amount;
        }
        else
            System.out.println("Insufficient balance");
    }

    public int getBalance() {
        return balance;
    }

    public String getOwner() {
        return owner;
    }
}
