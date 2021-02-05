package com.itacademy.java.oop.basics.task3;

import com.itacademy.java.oop.basics.task3.exceptions.NotEnoughBalanceException;

public class DebitCard extends Card {
    public DebitCard(double balance, String cardHolderName, String cardNumber) {
        super(balance, cardHolderName, cardNumber);
    }

    @Override
    double credit(double amount) {
        balance += amount;

        return balance;
    }

    @Override
    double debit(double amount) {
        if (amount > balance) {
            throw new NotEnoughBalanceException("Can't withdraw, not enough balance on card, your balance: "+ getBalance());
        }
        balance -= amount;
        return balance;
    }

}
