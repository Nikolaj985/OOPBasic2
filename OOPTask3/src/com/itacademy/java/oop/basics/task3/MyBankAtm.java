package com.itacademy.java.oop.basics.task3;

import com.itacademy.java.oop.basics.task3.exceptions.InsuficientAtmFundsException;

public class MyBankAtm implements Atm {
    private double balance;

    public MyBankAtm() {
    }

    public MyBankAtm(double balance) {
        this.balance = balance;
    }


    @Override
    public CreditCard withdraw(CreditCard creditCard, AtmOperation atmOperation, double amount) {
        if (atmOperation == AtmOperation.CREDIT) {
            CreditCard creditedCard = new CreditCard(creditCard.credit(amount), creditCard.getCardHolderName(), creditCard.getCardHolderName(), creditCard.getInterest(), creditCard.getCredit());
            balance += amount;
            System.out.printf("Your balance: %9f\n", creditedCard.getBalance());
            return creditedCard;
        }
        if (amount > balance) {
            throw new InsuficientAtmFundsException("Not enough money at ATM, you can withdraw maximum: " + balance);
        }
        CreditCard debitedCard = new CreditCard(creditCard.debit(amount), creditCard.getCardHolderName(), creditCard.getCardHolderName(), creditCard.getInterest(), creditCard.getCredit());
        balance -= amount;
        System.out.printf("Your balance: %9f\n", debitedCard.getBalance());
        return debitedCard;
    }

    @Override
    public DebitCard withdraw(DebitCard debitCard, AtmOperation atmOperation, double amount) {
        if (atmOperation == AtmOperation.CREDIT) {
            DebitCard creditedCard = new DebitCard(debitCard.credit(amount), debitCard.getCardHolderName(), debitCard.getCardHolderName());
            balance += amount;
            System.out.printf("Your balance: %9f\n", creditedCard.getBalance());
            return creditedCard;
        }
        if (amount > balance) {
            throw new InsuficientAtmFundsException("Not enough money at ATM, you can withdraw maximum: " + balance);
        }
        DebitCard debitedCard = new DebitCard(debitCard.debit(amount), debitCard.getCardHolderName(), debitCard.getCardHolderName());
        balance -= amount;
        System.out.printf("Your balance: %9f\n", debitedCard.getBalance());
        return debitedCard;
    }
}

