package com.company;

/**
 * Created by User on 15.06.2017.
 */
public class Car extends Vehicle {
    private String model;
    private int wheels;
    private int doors;
    private int gears;

    private int currentGear;


    public Car(String name, int passengers, String model, int wheels, int doors, int gears) {
        super(name, passengers);
        this.model = model;
        this.wheels = wheels;
        this.doors = doors;
        this.gears = gears;

        this.currentGear = 1;
    }

    public void changeGear(int currentGear) {
        this.currentGear = currentGear;
        System.out.println("Car.changeGear(): Changed to "+currentGear+" gear");
    }

    public void changeVelocity(int speed, int direction){
        moving(speed, direction);
        System.out.println("Car.changeVelocity(): Velocity is "+speed+ " direction is "+direction);
    }

    public String getModel() {
        return model;
    }

    public int getGears() {
        return gears;
    }

    public int getWheels() {
        return wheels;
    }
    public int getDoors() {
        return doors;
    }
    public int getCurrentGear() {
        return currentGear;
    }

}
