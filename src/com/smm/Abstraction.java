package com.smm;

abstract class BankAccount {
    float balance;
    abstract float getAccountBalance();
    abstract void setAccountBalance(float balance);

}

class Test extends BankAccount{

    public void setAccountBalance(float balance) {
        this.balance=balance;

    }

    public float getAccountBalance() {
        return  balance;

    }

}

public class Abstraction  {
    public static void main(String [] args) {

        Test obj = new Test ();
        obj.setAccountBalance(100.0f);
        System.out.println("balance is "+obj.getAccountBalance());


    }

}
