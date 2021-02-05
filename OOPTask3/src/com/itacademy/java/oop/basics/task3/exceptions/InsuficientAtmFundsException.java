package com.itacademy.java.oop.basics.task3.exceptions;

public class InsuficientAtmFundsException extends RuntimeException{
    public InsuficientAtmFundsException(String message) {
        super(message);
    }
}
