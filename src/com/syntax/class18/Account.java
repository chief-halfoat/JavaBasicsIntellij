package com.syntax.class18;

public class Account {
    private String userName = "Teyfur";
    private String password = "Admin";
    public String accountNumber = "123456";
    private double balance = -1500;

    private void printUserName(){
        System.out.println(userName);
    }

    protected void printPassword(){
        System.out.println(password);
    }
    void printBalance(){
        System.out.println(balance);
    }
    public void printAccountNumber(){
        System.out.println(accountNumber);
    }

    public static void main(String[] args) {
        Account obj = new Account();
        obj.printUserName();
        obj.printPassword();
        obj.printBalance();
        obj.printAccountNumber();

        obj.printUserName();
        obj.printPassword();
        obj.printBalance();
        obj.printAccountNumber();
    }
}
