package com.tka;
public class Demo {

    private int accNo;
    private String accHldName;
    private double balance;

    public int getAccNo() { // int b = a.getAccNo();
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
        this.balance = balance;
    }


    public static void main(String[] args) {
        Demo a = new Demo();
        System.out.println(a.getAccNo()); // getter
        a.setAccNo(30);
        a.setAccHldName("rahul");
        a.setBalance(400000);
        System.out.println(a.getAccNo());
        System.out.println(a.getAccHldName());
        System.out.println(a.getBalance());

    }
}


