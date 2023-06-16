package com.company;

public class BankAccount {
    private  int accountNumber;
    private double balance;
    private String name;
    private String email;
    private String phoneNumber;

    public BankAccount(){
        this(5678,2.50,"Default Name","Default address","Default Number");
        System.out.println("Empty constructor!!!");
    }

    public BankAccount(int accountNumber,double balance, String name, String email, String phoneNumber){
        System.out.println("Account with parameters");
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.name = name;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    public BankAccount(String name, String email, String phoneNumber){
        this(9999, 102.3,name,email,phoneNumber);
    }

    public void deposit(double depositAmount){
        this.balance += depositAmount;
        System.out.println("Deposit of "+ depositAmount +" is made. New balance is: "+ this.balance);
    }

    public void withdrawal(double withdrawalAmount){
        if (withdrawalAmount > this.balance){
            System.out.println("Only "+this.balance+" available. Withdrawal not processed.");
        }
        else {
            this.balance-=withdrawalAmount;
            System.out.println("Withdrawal amount "+ withdrawalAmount+ " processed. Remaining balance is: "+ this.balance);
        }
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
