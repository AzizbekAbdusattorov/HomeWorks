package Lesson_16.Homework3;

public class Main {
    public static void main(String[] args) {
        Car car1 = Car.getInstance("Toyota", 50);
        Car car2 = Car.getInstance("Honda", 30);

        System.out.println("Car 1 is active: " + car1.isActive());
        System.out.println("Car 2 is active: " + car2.isActive());

        System.out.println("Refuel Car 1: " + car1.refuel(20));
        System.out.println("Refuel Car 2: " + car2.refuel(40));

        System.out.println("Car 1 is active: " + car1.isActive());
        System.out.println("Car 2 is active: " + car2.isActive());

        System.out.println("Max way for Car 1: " + car1.getMaxWay(5));
        System.out.println("Max way for Car 2: " + car2.getMaxWay(3));
    }
}
