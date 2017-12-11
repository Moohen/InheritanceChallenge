package com.mateusz;

public class AudiR8 extends Car {

    private int bodyType;
    private int windows;
    private int tankCapacity;
    private String model;
    private String equipment;
    private String typeOfGearbox;

    public AudiR8(String name, String typeOfEngine, String typeOfPower, String typeOfLoading, String countryOfOrigin,
                  String yearOfProduction, String typeOfControl, int height, int width, int thickness, int weight,
                  int bearingCapacity, int numberOfSeats, int horsepower, int wheels, int displacement, int maxSpeed,
                  double acceleration, String brand, String typeOfDrive, String modelOfEngine, int bodyType,
                  int windows, int tankCapacity, String model, String equipment, String typeOfGearbox) {
        super(name, typeOfEngine, typeOfPower, typeOfLoading, countryOfOrigin, yearOfProduction, typeOfControl, height,
                width, thickness, weight, bearingCapacity, numberOfSeats, horsepower, wheels, displacement, maxSpeed,
                acceleration, brand, typeOfDrive, modelOfEngine);
        this.bodyType = bodyType;
        this.windows = windows;
        this.tankCapacity = tankCapacity;
        this.model = model;
        this.equipment = equipment;
        this.typeOfGearbox = typeOfGearbox;
    }

    @Override
    public void handSteering(int degrees, String direction) {
        super.handSteering(degrees, direction);
    }

    @Override
    public void increasingGear(int gear) {
        super.increasingGear(gear);
    }

    @Override
    public void decreasingGear(int gear) {
        super.decreasingGear(gear);
    }

    @Override
    public void increasingSpeed(int speed) {
        super.increasingSpeed(speed);
    }

    @Override
    public void decreasingSpeed(int speed) {
        super.decreasingSpeed(speed);
    }

    public int getBodyType() {
        return bodyType;
    }

    public int getWindows() {
        return windows;
    }

    public int getTankCapacity() {
        return tankCapacity;
    }

    public String getModel() {
        return model;
    }

    public String getEquipment() {
        return equipment;
    }

    public String getTypeOfGearbox() {
        return typeOfGearbox;
    }
}
