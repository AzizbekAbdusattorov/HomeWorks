package Lesson_7.Car;

import Lesson_7.Car.Car;

public class Malibu extends Car {
    public Malibu(int weight, int fuelCapacity, int breakingDistance) {
        super(weight, fuelCapacity, breakingDistance);
    }

    @Override
    void showInfo() {
        super.showInfo();
        System.out.println("Malibu class: ");
    }
}
