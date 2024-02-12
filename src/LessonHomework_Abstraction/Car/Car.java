package LessonHomework_Abstraction.Car;

public abstract class Car {
    protected double maxCapacity; // Yoqilg'i maydoni hajmi
    protected double busyCapacity; // Qayd etilgan yoqilg'i hajmi

    public Car(double maxCapacity, double busyCapacity) {
        this.maxCapacity = maxCapacity;
        this.busyCapacity = busyCapacity;
    }

    abstract double maxLongestWay();

    abstract double getMaxOilFromRefill();
}
