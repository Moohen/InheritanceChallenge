package com.mateusz;

public class AudiR8 extends Car {

    private int bodyType;
    private int windows;
    private int tankCapacity;
    private int roadServiceMonths;
    private String model;
    private String equipment;
    private String typeOfGearbox;

    public AudiR8(int bodyType, int windows, int tankCapacity, int roadServiceMonths, String model, String equipment,
                  String typeOfGearbox) {
        super("AudiR8", "motor engine", "gas", "car",
                "Germany", "2006", "steering wheel", 1249,
                4431, 1904, 1454, 1000, 2, 430,
                0, 0, 4, 4163, 301, 6, 4.6,
                "Audi", "Quattro", "Audi FSI V8 32V", true);
        this.bodyType = bodyType;
        this.windows = windows;
        this.tankCapacity = tankCapacity;
        this.roadServiceMonths = roadServiceMonths;
        this.model = model;
        this.equipment = equipment;
        this.typeOfGearbox = typeOfGearbox;
    }

    public void accelerate(int rate) {
        int newVelocity = getCurrentVelocity() + rate;

        if(newVelocity == 0) {
            stop();
            changeGear(1);
        } else if (newVelocity > 0 && newVelocity <= 10) {
            changeGear(1);
        } else if (newVelocity > 10 && newVelocity <= 20) {
            changeGear(2);
        } else if (newVelocity > 20 && newVelocity <= 30) {
            changeGear(3);
        } else if (newVelocity > 30 && newVelocity <= 40) {
            changeGear(4);
        } else if (newVelocity > 40 && newVelocity <= 50) {
            changeGear(5);
        } else {
            changeGear(6);
        }

        if(newVelocity > 0) {
            changeVelocity(newVelocity, getCurrentDirection());
        }
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
