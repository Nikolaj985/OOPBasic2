package com.itacademy.java.oop.basics.task2;

public class BicycleApplication {
    public static void main(String[] args) {
        MountainBike mountainBike = new MountainBike(Bike.MOUNTAIN, 30, 20);
        RoadBike roadBike = new RoadBike(Bike.ROAD, 10, 9);

       //Mountain bike error catch
        try {
            mountainBike.speedUp(1000);
        } catch (IllegalArgumentException ex) {
            System.out.println(ex.getMessage());

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        try {
            mountainBike.speedUp(-10);
        } catch (IllegalArgumentException ex) {
            System.out.println(ex.getMessage());

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
         try {
            mountainBike.applyBrakes(-100);
        } catch (IllegalArgumentException ex) {
            System.out.println(ex.getMessage());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        try {
            mountainBike.applyBrakes(100);
        } catch (IllegalArgumentException ex) {
            System.out.println(ex.getMessage());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        try {
            mountainBike.changeGear(100);
        } catch (IllegalArgumentException ex) {
            System.out.println(ex.getMessage());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        try {
            mountainBike.changeGear(100);
        } catch (IllegalArgumentException ex) {
            System.out.println(ex.getMessage());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        try {
            mountainBike.changeGear(1);
        } catch (IllegalArgumentException ex) {
            System.out.println(ex.getMessage());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        try {
            roadBike.changeGear(2);
        } catch (IllegalArgumentException ex) {
            System.out.println(ex.getMessage());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        try {
            roadBike.changeGear(-10);
        } catch (IllegalArgumentException ex) {
            System.out.println(ex.getMessage());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        try {
            roadBike.speedUp(-10);
        } catch (IllegalArgumentException ex) {
            System.out.println(ex.getMessage());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        try {
            roadBike.speedUp(100);
        } catch (IllegalArgumentException ex) {
            System.out.println(ex.getMessage());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        try {
            roadBike.applyBrakes(10);
        } catch (IllegalArgumentException ex) {
            System.out.println(ex.getMessage());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        try {
            roadBike.applyBrakes(-40);
        } catch (IllegalArgumentException ex) {
            System.out.println(ex.getMessage());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }


        //To reduce code function call's without errors won't include try catch
        mountainBike.speedUp(25);
        mountainBike.applyBrakes(10);
        mountainBike.changeGear(-1);

        roadBike.speedUp(25);
        roadBike.applyBrakes(-10);
        roadBike.changeGear(-2);

        Bike firstWinner = Speedometer.chooseWinner(mountainBike, roadBike);
        System.out.println("The first winner: " + firstWinner.getName());

        mountainBike.applyBrakes(20);
        roadBike.speedUp(10);

        Bike secondWinner = Speedometer.chooseWinner(mountainBike.getCurrentSpeed(), roadBike.getCurrentSpeed());
        System.out.println("The second winner: " + secondWinner.getName());
    }
}
