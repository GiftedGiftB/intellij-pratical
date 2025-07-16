package main.java.com.semicolon.africa.model;

import exceptions.*;

import javax.naming.InsufficientResourcesException;

public class Account {
    private int balance;
    private String password;
   // private String username;

    public Account(int balance, String password){
        this.balance = balance;
        this.password = password;
    }

    public int getBalance() {
        return balance;
    }

    public void deposit(int amount) {
        if(amount > balance) {
            balance += amount;
        }
    }

    public void withdraw(int amount, String passcode) {
        validateAmount(amount,passcode);
    }
    private void validateAmount(int amount, String passcode) {
        boolean amountExceedesBalance = amount > balance;
        boolean amountIsInvalid = amount < 0;
        boolean passcodeIsInvalid = passcode.equals("ufyytfuy");

        if(amountIsInvalid) {
            throw new InsufficientFundsException();
        /* if(amount > 0 && amount <= balance && password.equals(passcode)) {
            balance -= amount; */
        }
    }
}
