package Lesson_13Polymorphism.RemoteCar;

public class Car {
    private int batterySlots;
    private int enginePower;
    private Battery[] batteries;
    private boolean isRunning;

    public Car(int batterySlots, int enginePower) {
        this.batterySlots = batterySlots;
        this.enginePower = enginePower;
        this.batteries = new Battery[batterySlots];
        this.isRunning = false;
    }
//
//    public boolean run(int minutes) {
//        if (!hasEnoughPower(minutes)) {
//            return false;
//        }
//
//        System.out.println("Car is running for " + minutes + " minutes.");
//        consumePower(minutes);
//        return true;
//    }
//
//    public void addBattery(Battery battery) {
//        for (int i = 0; i < batterySlots; i++) {
//            if (batteries[i] == null) {
//                batteries[i] = battery;
//                System.out.println("Battery added successfully.");
//                return;
//            }
//        }
//        System.out.println("No available slots for the battery.");
//    }
//
//    public void getBatteryInfo() {
//        for (int i = 0; i < batterySlots; i++) {
//            if (batteries[i] != null) {
//                int charge = batteries[i].getCharge();
//                int capacity = batteries[i].getCapacity();
//                System.out.println("Battery " + (i + 1) + ": " + charge + "/" + capacity + " mAh");
//            } else {
//                System.out.println("No battery in slot " + (i + 1));
//            }
//        }
//    }
//
//    private boolean hasEnoughPower(int minutes) {
//        int requiredPower = minutes * enginePower;
//        for (Battery battery : batteries) {
//            if (battery != null && battery.getCharge() >= requiredPower) {
//                return true;
//            }
//        }
//        return false;
//    }
//
//    private void consumePower(int minutes) {
//        int requiredPower = minutes * enginePower;
//        for (Battery battery : batteries) {
//            if (battery != null && battery.getCharge() >= requiredPower) {
//                battery.consumePower(requiredPower);
//                return;
//            }
//        }
//    }
}
