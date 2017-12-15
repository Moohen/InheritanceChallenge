package com.mateusz;

public class Vehicle {

    private String name;
    private String typeOfEngine;
    private String typeOfPower;
    private String typeOfLoading;
    private String countryOfOrigin;
    private String yearOfProduction;
    private String typeOfControl;
    private int height;
    private int width;
    private int thickness;
    private int weight;
    private int bearingCapacity;
    private int numberOfSeats;
    private int horsepower;
    private int currentVelocity;
    private int currentDirection;


    public Vehicle(String name, String typeOfEngine, String typeOfPower, String typeOfLoading, String countryOfOrigin,
                   String yearOfProduction, String typeOfControl, int height, int width, int thickness, int weight,
                   int bearingCapacity, int numberOfSeats, int horsepower, int currentVelocity, int currentDirection) {
        this.name = name;
        this.typeOfEngine = typeOfEngine;
        this.typeOfPower = typeOfPower;
        this.typeOfLoading = typeOfLoading;
        this.countryOfOrigin = countryOfOrigin;
        this.yearOfProduction = yearOfProduction;
        this.typeOfControl = typeOfControl;
        this.height = height;
        this.width = width;
        this.thickness = thickness;
        this.weight = weight;
        this.bearingCapacity = bearingCapacity;
        this.numberOfSeats = numberOfSeats;
        this.horsepower = horsepower;
        this.currentVelocity = 0;
        this.currentDirection = 0;
    }

    public void steer(int direction) {
        this.currentDirection += direction;
        System.out.println("vehicle.steer(): Steering at " + currentDirection + " degrees.");
    }

    public void move(int velocity, int direction) {
        currentVelocity = velocity;
        currentDirection = direction;
        System.out.println("Vehicle.move() Moving at " + currentVelocity + " in direction " + currentDirection);
    }

    public void stop() {
        this.currentVelocity = 0;
    }

    public String getName() {
        return name;
    }

    public String getTypeOfEngine() {
        return typeOfEngine;
    }

    public String getTypeOfPower() {
        return typeOfPower;
    }

    public String getTypeOfLoading() {
        return typeOfLoading;
    }

    public String getCountryOfOrigin() {
        return countryOfOrigin;
    }

    public String getYearOfProduction() {
        return yearOfProduction;
    }

    public String getTypeOfControl() {
        return typeOfControl;
    }

    public int getHeight() {
        return height;
    }

    public int getWidth() {
        return width;
    }

    public int getThickness() {
        return thickness;
    }

    public int getWeight() {
        return weight;
    }

    public int getBearingCapacity() {
        return bearingCapacity;
    }

    public int getNumberOfSeats() {
        return numberOfSeats;
    }

    public int getHorsepower() {
        return horsepower;
    }

    public int getCurrentVelocity() {
        return currentVelocity;
    }

    public int getCurrentDirection() {
        return currentDirection;
    }
}
