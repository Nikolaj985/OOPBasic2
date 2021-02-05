package com.itacademy.java.oop.basics.task1;

public class Square extends Shape{
    private double side;

    public Square() {
    }

    public Square(int side) {
        this.side = side;
    }

    @Override
    public double calculateArea() {
        return side*side;
    }

    @Override
    public double calculatePerimeter() {
        return  side*4;
    }

    @Override
    public String toString() {
        return "Square{" +
                "side=" + side +
                '}';
    }
}
