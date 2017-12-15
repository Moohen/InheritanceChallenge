package com.mateusz;

public class Car extends Vehicle {

    private int wheels;
    private int displacement;
    private int maxSpeed;
    private int gears;
    private double acceleration;
    private String brand;
    private String typeOfDrive;
    private String modelOfEngine;
    private boolean isManual;

    private int currentGear;


    public Car(String name, String typeOfEngine, String typeOfPower, String typeOfLoading, String countryOfOrigin,
               String yearOfProduction, String typeOfControl, int height, int width, int thickness, int weight,
               int bearingCapacity, int numberOfSeats, int horsepower, int currentVelocity, int currentDirection,
               int wheels, int displacement, int maxSpeed, int gears, double acceleration, String brand, String typeOfDrive,
               String modelOfEngine, boolean isManual) {
        super(name, typeOfEngine, typeOfPower, typeOfLoading, countryOfOrigin, yearOfProduction, typeOfControl, height,
                width, thickness, weight, bearingCapacity, numberOfSeats, horsepower, currentVelocity, currentDirection);
        this.wheels = wheels;
        this.displacement = displacement;
        this.maxSpeed = maxSpeed;
        this.gears = gears;
        this.acceleration = acceleration;
        this.brand = brand;
        this.typeOfDrive = typeOfDrive;
        this.modelOfEngine = modelOfEngine;
        this.isManual = isManual;
        this.currentGear = 1;
    }

    public void changeGear(int currentGear) {
        this.currentGear = currentGear;
        System.out.println("Car.setCurrentGear(): Changed to " + this.currentGear + " gear.");
    }

    public void changeVelocity(int speed, int direction) {
        move(speed, direction);
        System.out.println("Car.changeVelocity():  Velocity " + speed + " direction " + direction);
    }

    public int getWheels() {
        return wheels;
    }

    public int getDisplacement() {
        return displacement;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public double getAcceleration() {
        return acceleration;
    }

    public String getBrand() {
        return brand;
    }

    public String getTypeOfDrive() {
        return typeOfDrive;
    }

    public String getModelOfEngine() {
        return modelOfEngine;
    }
}
