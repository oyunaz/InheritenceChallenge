package com.company;

/**
 * Created by User on 15.06.2017.
 */
public class Vehicle {
    private String name;
    private int passengers;

    private int currentDirection;
    private int currentVelocity;

    public Vehicle(String name, int passengers) {
        this.name = name;
        this.passengers = passengers;

        this.currentDirection=0;
        this.currentVelocity=0;
    }

    public void steer(int direction){
        currentDirection+=direction;
        System.out.println("Vehicle.steer(): Steering at "+currentDirection+" degrees");
    }


    public void moving(int speed, int direction){
        currentVelocity+=speed;
        currentDirection+=direction;
        System.out.println("Current speed is "+speed+" current direction is "+direction);
    }

    public void stop(){
        this.currentVelocity = 0;
    }

    public String getName() {
        return name;
    }

    public int getPassengers() {
        return passengers;
    }

}