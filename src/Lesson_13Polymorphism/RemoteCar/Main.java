package Lesson_13Polymorphism.RemoteCar;

public class Main {
    public static void main(String[] args) {
        Battery battery1 = new Battery(3000);
        Battery battery2 = new Battery(2000);

        Car car = new Car(2, 100);

//        car.addBattery(battery1);
//        car.addBattery(battery2);
//
//        car.getBatteryInfo();
//
//        car.run(30); // Try running the car for 30 minutes
//        car.run(60); // Try running the car for 60 minutes
//
//        car.getBatteryInfo();
    }
}
