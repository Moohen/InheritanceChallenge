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

    public Vehicle(String name, String typeOfEngine, String typeOfPower, String typeOfLoading, String countryOfOrigin,
                   String yearOfProduction, String typeOfControl, int height, int width, int thickness, int weight,
                   int bearingCapacity, int numberOfSeats, int horsepower) {
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
}
