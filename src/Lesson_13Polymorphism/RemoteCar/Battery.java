package Lesson_13Polymorphism.RemoteCar;

public class Battery {
    private int capacity; // mAh
    private int charge; // mAh

    public Battery(int capacity) {
        this.capacity = capacity;
        this.charge = 0;
    }

    public int getCharge() {
        return charge;
    }

    public boolean charge(int amount) {
        if (amount < 0) {
            return false;
        }
        charge = Math.min(charge + amount, capacity);
        return true;
    }
}
