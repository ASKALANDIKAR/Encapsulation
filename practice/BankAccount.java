
//  Create a class BankAccount with private fields: accountNumber, accountHolderName, and balance.
//  Provide public methods to deposit, withdraw, and get balance.
//  Ensure that the balance cannot be set to a negative value.


package com.practice;

public class BankAccount {

    private int accNo;
    private String accHldName;
    private double balance;

    public int getAccNo() {
        return accNo;
    }

    public void setAccNo(int accNo) {
        this.accNo = accNo;
    }

    public String getAccHldName() {
        return accHldName;
    }

    public void setAccHldName(String accHldName) {
        this.accHldName = accHldName;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        if (balance >= 0) {
            this.balance = balance;
        }
        else {
            System.out.println("Setting Invalid Balance...");
        }
    }

        BankAccount(int  accNo, String accHldName, double balance){
        this.accNo= accNo;
        this.accHldName= accHldName;
        this.balance= balance;
    }

    public void deposit(double amount){
        if(amount>=0){
            balance=balance+amount;
            System.out.println("\n"+"Deposited Rs: "+ amount);
            System.out.println("Current Balance: "+balance+"\n\n");
        }
        else {
            System.out.println("\nThe Given Amount is Invalid: "+ amount +"\n");
        }
    }
    public void withdraw(double amount){
        if(amount>0 && amount<=balance) {

            System.out.println("Making Withdraw of amount: " + amount);
            balance = balance - amount;
            System.out.println("Current Balance: " + balance);
        }
        else {
            System.out.println("Making Withdraw of amount: "+amount);
            System.out.println("Can't Make a Withdraw \n Account Balance: "+balance);
        }
    }

    public void check(){
        System.out.println("Your Current Balance: "+balance);
    }


}

