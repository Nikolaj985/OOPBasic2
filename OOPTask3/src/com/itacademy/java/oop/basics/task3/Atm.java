package com.itacademy.java.oop.basics.task3;

public interface Atm {
     CreditCard withdraw(CreditCard creditCard, AtmOperation atmOperation, double amount);
     DebitCard withdraw(DebitCard debitCard, AtmOperation atmOperation, double amount);



}
