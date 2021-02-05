package com.itacademy.java.oop.basics.task3.exceptions;

public class NotEnoughtCreditException extends RuntimeException{
    public NotEnoughtCreditException(String message) {
        super(message);
    }
}
