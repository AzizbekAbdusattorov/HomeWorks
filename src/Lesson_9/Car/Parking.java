package Lesson_9.Car;

public class Parking {
    private int maxCount;
    private Car[] cars;
    private int count;

    public Parking(int maxCount) {
        this.maxCount = maxCount;
        this.cars = new Car[maxCount];
        this.count = 0;
    }

    public void addCar(Car car) {
        if (count < maxCount) {
            cars[count++] = car;
            System.out.println(car.getName() + " mashinasi joylandi.");
        } else {
            System.out.println("Parkovkada joy yo'q! " + car.getName() + " mashinasi joylashmadi.");
        }
    }

    public void addCars(Car[] newCars) {
        if (count + newCars.length <= maxCount) {
            System.arraycopy(newCars, 0, cars, count, newCars.length);
            count += newCars.length;
            System.out.println("Hamma mashinalar joylashdi.");
        } else {
            System.out.println("Parkovkada joy yetarli emas! Mashinalar joylashmadi.");
        }
    }

    public boolean isEmpty() {
        return count == 0;
    }

    public boolean isFull() {
        return count == maxCount;
    }

    public void show() {
        System.out.println("Parkovkadagi mashinalar:");
        for (int i = 0; i < count; i++) {
            Car car = cars[i];
            System.out.println("Mashina #" + (i + 1) + ": " + car.getName() + " - " + car.getNumber());
        }
    }
}