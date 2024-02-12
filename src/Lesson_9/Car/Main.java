package Lesson_9.Car;

public class Main {
    public static void main(String[] args) {
        Parking parking = new Parking(3);

        Car car1 = new Car("Toyota", "ABC123");
        Car car2 = new Car("Honda", "XYZ789");
        Car car3 = new Car("Ford", "123XYZ");

        parking.addCar(car1);
        parking.addCars(new Car[]{car2, car3});

        parking.show();

        System.out.println("Parkovka bo'sh: " + parking.isEmpty());
        System.out.println("Parkovka to'la: " + parking.isFull());
    }
}
