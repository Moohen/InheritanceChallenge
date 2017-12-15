package com.mateusz;

public class Main {

    public static void main(String[] args) {

        AudiR8 audiR8 = new AudiR8(2, 6, 75, 36,
                "R8", " ABS, EBD, ASR, EDS", "manual");

        audiR8.steer(45);
        audiR8.accelerate(30);
        audiR8.accelerate(20);

    }
}
