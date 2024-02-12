package Lesson_7.Car;

import Lesson_7.Car.Car;

public class Captiva extends Car {
    public Captiva(int weight, int fuelCapacity, int breakingDistance){
        super(weight, fuelCapacity, breakingDistance);
    }

    @Override
    void showInfo() {
        super.showInfo();
        System.out.println("Captiva class: ");
    }
}
