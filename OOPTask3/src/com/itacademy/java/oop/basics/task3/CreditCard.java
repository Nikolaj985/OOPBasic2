package com.itacademy.java.oop.basics.task3;

import com.itacademy.java.oop.basics.task3.exceptions.NotEnoughBalanceException;
import com.itacademy.java.oop.basics.task3.exceptions.NotEnoughtCreditException;

public class CreditCard extends Card {
    private double interest;
    private double credit;

    public CreditCard(double balance, String cardHolderName, String cardNumber, double interest, double credit) {
        super(balance, cardHolderName, cardNumber);
        this.interest = interest;
        this.credit = credit;
    }

    public double getInterest() {
        return interest;
    }

    public double getCredit() {
        return credit;
    }

    @Override
    double credit(double amount) {
        balance += amount;

        return balance;
    }

    @Override
    double debit(double amount) {
        if ((amount + amount * interest / 100) > (balance + credit)) {
            throw new NotEnoughtCreditException("Can't withdraw, not enough balance on credit card, your balance: " + (getBalance()+ " and credit: " +credit));
        }
        balance -= (amount + amount * interest / 100);
        return balance;
    }
}
