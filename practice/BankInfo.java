package com.practice;

import java.util.Scanner;

public class BankInfo {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in); // let's Take input from Console(User)


        System.out.println("Enter Account Number: ");
        int no = sc.nextInt();

        System.out.println("Enter Account Holder Name: ");
        String name = sc.next();

        System.out.println("Enter your Balance: ");
        double bal = sc.nextDouble();


        BankAccount b1 = new BankAccount(no,name,bal);


        System.out.println("\n\n------Account Details------\n");
        b1.setAccNo(no);
        System.out.println("Account Number: "+ b1.getAccNo());
        b1.setAccHldName(name);
        System.out.println("Holder Name: "+ b1.getAccHldName() );
        b1.setBalance(bal);
        System.out.println("Balance :"+b1.getBalance());

        System.out.println("\n 1. Deposit ");
        System.out.println("2. Withdraw");
        System.out.println("3.Check Balance");
        System.out.println("Enter your Choice :");
        int choice = sc.nextInt();
        switch (choice){
            case 1:
                System.out.println("Enter Depositing Amount: ");
                double amount=sc.nextDouble();
                b1.deposit(amount);
                break;
            case 2:
                System.out.println("Enter Withdraw Amount: ");
                double amount1 = sc.nextDouble();
                b1.withdraw(amount1);
                break;
            case 3:
                b1.check();
                break;
            default:
                System.out.println("Invalid Choice....");
        }

    }
}
