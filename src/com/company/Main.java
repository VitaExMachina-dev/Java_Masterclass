package com.company;

public class Main {

    public static void main(String[] args) {

//        Coding Exercise 1: Speed Converter
//        SpeedConverter.printConversion(1.5);
//        SpeedConverter.printConversion(10.25);
//        SpeedConverter.printConversion(-1);
//        SpeedConverter.printConversion(16);
//        SpeedConverter.printConversion(47);

//        Coding Exercise 2: MegaBytes Converter
//        MegaBytesConverter.printMegaBytesAndKiloBytes(2500);

//        Coding Exercise 3: Barking Dog
        System.out.println(BarkingDog.shouldWakeUp (true, 1)); // true
        System.out.println(BarkingDog.shouldWakeUp (false, 2)); // false
        System.out.println(BarkingDog.shouldWakeUp (true, 8)); // false
        System.out.println(BarkingDog.shouldWakeUp (true, -1)); // false
    }
}
