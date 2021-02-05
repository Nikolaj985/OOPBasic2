package com.itacademy.java.oop.basics.task2;

public enum Bike {
    MOUNTAIN("Mountain bike"), ROAD("Road bike");
    private String name;

    Bike(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
