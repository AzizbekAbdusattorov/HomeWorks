package Lesson_8.GasStation;

public class Car {
    private Capacity capacity;
    private Oil oil;

    public Car(Capacity capacity, Oil oil) {
        this.capacity = capacity;
        this.oil = oil;
    }

    public Capacity getCapacity() {
        return capacity;
    }

    public Oil getOil() {
        return oil;
    }
}
