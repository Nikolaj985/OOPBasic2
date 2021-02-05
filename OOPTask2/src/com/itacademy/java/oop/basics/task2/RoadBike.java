package com.itacademy.java.oop.basics.task2;

public class RoadBike implements Bicycle {
    private Bike name;
    private int currentSpeed;
    private int currentGear;

    public RoadBike(Bike name, int currentSpeed, int currentGear) {
        this.name = name;
        this.currentSpeed = currentSpeed;
        this.currentGear = currentGear;
    }

    public Bike getName() {
        return name;
    }

    public int getCurrentSpeed() {
        return currentSpeed;
    }

    @Override
    public void changeGear(int newGear) {
        if (newGear > 2){
            throw new IllegalArgumentException("Gear can't only be increased by "+ newGear + ", available values 2, 1 or -1, -2. Please use 2");
        } else if (newGear <-2){
            throw new IllegalArgumentException("Gear can't only be decreased by "+ newGear + ", available values 2, 1 or -1, -2. Please use -2");
        }else if (newGear == 0){
            throw new IllegalArgumentException("Gear can't only be increased by "+ newGear + ", available values 2, 1 or -1, -2. Please use 1 or -1");
        }else if (newGear + currentGear > 10 || newGear + currentGear < 0) {
            throw new IllegalArgumentException("Gear cant be changed, as it can't exceed boundaries [0;10], current gear: " +currentGear);
        }
        currentGear += newGear;
        System.out.println("Gear change succeeded, current gear :" + currentGear);
    }

    @Override
    public void speedUp(int increment) {
        if(increment < 0){
            throw new IllegalArgumentException("You can't use negative numbers when increasing speed on road bike, please use positive numbers");
        }else if (currentSpeed + increment > 50) {
            throw new IllegalArgumentException("Speed cant be greater than 50, you can maximum increase by " + (50-currentSpeed));
        }
        currentSpeed+=increment;
        System.out.println("Speeding succeeded, current speed :" + currentSpeed);
    }

    @Override
    public void applyBrakes(int decrease) {
        if (currentSpeed + decrease < 0) {
            throw new IllegalArgumentException("Speed cant be negative, you can maximum decrease by " + -currentSpeed);
        }else if(decrease > 0){
            throw new IllegalArgumentException("You can't use positive numbers when breaking road bike, please use negative numbers");
        }
        currentSpeed+=decrease;
        System.out.println("Breaking succeeded, current speed :" + currentSpeed);
    }
}
