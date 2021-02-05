package com.itacademy.java.oop.basics.task1;



public class ShapeApplication {
    public static void main(String[] args) {
        Circle circle = new Circle(50);
        Square square = new Square(100);
        System.out.println(circle.calculatePerimeter());
        System.out.println(circle.calculateArea());
        System.out.println(square.calculatePerimeter());
        System.out.println(square.calculateArea());
        System.out.println(circle.toString());
        System.out.println(square.toString());

    }
}
