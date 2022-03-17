package com.sectio7projects;

public class BankAccountDemo {
    public static void main(String[] args) {
        var account1 = new BankAccount("abc");
        var account2 = new BankAccount("def",5000);
        var account3 = new BankAccount("xyz",20000);

        System.out.println(account1.getOwner());
        System.out.println(account1.getBalance());
        account1.deposit(4000);
        System.out.println(account1.getBalance());
        account1.withdraw(2000);
        account1.withdraw(3000);
        System.out.println(account1.getBalance());
    }

}
