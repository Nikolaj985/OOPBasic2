package com.itacademy.java.oop.basics.task2;

public class MountainBike implements Bicycle {
    private Bike name;
    private int currentSpeed;
    private int currentGear;

    public MountainBike(Bike name, int currentSpeed, int currentGear) {
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
        if (newGear > 1 || newGear < -1 || newGear==0 ) {
            throw new IllegalArgumentException("Gear can only be increased or decreased by only 1 or -1. Please use using 1 or -1");
        } else if (newGear + currentGear > 20 || newGear + currentGear < 0) {
            throw new IllegalArgumentException("Gear cant be changed, as it can't exceed boundaries [0;20], current gear: "+currentGear);
        }
        currentGear += newGear;
        System.out.println("Gear change succeeded, current gear :" + currentGear);
    }

    @Override
    public void speedUp(int increment) {
        if (increment < 0) {
            throw new IllegalArgumentException("Increment can't be negative");
        }
        if ((currentSpeed + increment) > 100) {

            throw new IllegalArgumentException("Maximum speed allowed is 100, you can increase max by " + (100 - currentSpeed));
        }
        currentSpeed += increment;
        System.out.println("Speedup succeeded, speed :" + currentSpeed);
    }

    @Override
    public void applyBrakes(int decrease) {
        if (decrease < 0) {
            throw new IllegalArgumentException("You can't use negative numbers to brake, please use positive numbers.");
        }else if(currentSpeed-decrease<-10){
            throw new IllegalArgumentException("Speed can't be lower than -10, you can brake max by "+Math.abs(-10 - currentSpeed));
        }
        currentSpeed-=decrease;
        System.out.println("Breaking succeeded, speed :" + currentSpeed);
    }
}
