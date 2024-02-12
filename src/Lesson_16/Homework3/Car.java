package Lesson_16.Homework3;

public class Car {
    private static Car instance;
    private final String name;
    private final int maxCapacity;
    private int busyCapacity;

    private Car(String name, int maxCapacity) {
        this.name = name;
        this.maxCapacity = maxCapacity;
        this.busyCapacity = 0;
    }

    public static Car getInstance(String name, int maxCapacity) {
        if (instance == null) {
            instance = new Car(name, maxCapacity);
        }
        return instance;
    }

    public boolean isActive() {
        return busyCapacity > 0;
    }

    public boolean refuel(int addPetrol) {
        if (busyCapacity + addPetrol <= maxCapacity) {
            busyCapacity += addPetrol;
            return true;
        }
        return false;
    }

    public int getMaxWay(int value) {
        return busyCapacity * value;
    }

}
