package com.mateusz;

public class Main {

    public static void main(String[] args) {

        AudiR8 audiR8 = new AudiR8("AudiR8", "motor engine", "gas", "car",
                "Neckarsulm", "2006", "steering wheel", 1249,
                4431, 1904, 1454, 1000, 2,
                430, 4, 4163, 301,4.6, "Audi",
                "Quattro", "Audi FSI V8 32V", 2, 6, 75,
                "R8", " ABS, EBD, ASR, EDS", "manual");

        audiR8.handSteering(45, "left");
        audiR8.increasingGear(3);
        audiR8.decreasingGear(2);
        audiR8.increasingSpeed(100);
        audiR8.decreasingSpeed(50);

    }
}
