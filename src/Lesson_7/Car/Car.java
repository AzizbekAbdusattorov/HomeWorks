package Lesson_7.Car;

public class Car {
    int weight;     // vazn
    int fuelCapacity;       // yoqilg'i quvvati
    int breakingDistance;       // uzilish masofasi

    public Car(int weight, int fuelCapacity, int breakingDistance){
        this.weight = weight;
        this.fuelCapacity = fuelCapacity;
        this.breakingDistance = breakingDistance;
    }

    void showInfo(){
        System.out.println("Weight: " + weight);
        System.out.println("Fuel Capacity: " + fuelCapacity);
        System.out.println("Breaking Distance: " + breakingDistance);
    }


}
