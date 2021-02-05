package com.itacademy.java.oop.basics.task2;

public class Speedometer {
    static Bike chooseWinner(MountainBike mountainBike, RoadBike roadBike){
        if(mountainBike.getCurrentSpeed()> roadBike.getCurrentSpeed()){
            return mountainBike.getName();
        }
        return roadBike.getName();
    }

    static Bike chooseWinner(int mountainBikeSpeed, int roadBikeSpeed){
        if(mountainBikeSpeed>roadBikeSpeed){
            return Bike.MOUNTAIN;
        }
        return Bike.ROAD;
    }
}
