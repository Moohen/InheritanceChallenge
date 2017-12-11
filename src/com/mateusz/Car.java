package com.mateusz;

public class Car extends Vehicle {

    private int wheels;
    private int displacement;
    private int maxSpeed;
    private double acceleration;
    private String brand;
    private String typeOfDrive;
    private String modelOfEngine;

    public Car(String name, String typeOfEngine, String typeOfPower, String typeOfLoading, String countryOfOrigin,
               String yearOfProduction, String typeOfControl, int height, int width, int thickness, int weight,
               int bearingCapacity, int numberOfSeats, int horsepower, int wheels, int displacement, int maxSpeed,
               double acceleration, String brand, String typeOfDrive, String modelOfEngine) {
        super(name, typeOfEngine, typeOfPower, typeOfLoading, countryOfOrigin, yearOfProduction, typeOfControl, height,
                width, thickness, weight, bearingCapacity, numberOfSeats, horsepower);
        this.wheels = wheels;
        this.displacement = displacement;
        this.maxSpeed = maxSpeed;
        this.acceleration = acceleration;
        this.brand = brand;
        this.typeOfDrive = typeOfDrive;
        this.modelOfEngine = modelOfEngine;
    }

    public void handSteering(int degrees, String direction) {
        System.out.println("Your car has turned " + direction + " by " + degrees);
    }

    public void increasingGear(int gear) {
        System.out.println("You changed gear to " + gear);
    }

    public void decreasingGear(int gear) {
        System.out.println("You changed gear to " + gear);
    }

    public void increasingSpeed(int speed) {
        System.out.println("The speed of the car increased by " + speed);
    }

    public void decreasingSpeed(int speed) {
        System.out.println("The speed of the car decreased by " + speed);
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
