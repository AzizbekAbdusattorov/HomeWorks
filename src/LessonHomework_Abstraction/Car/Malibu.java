package LessonHomework_Abstraction.Car;

public class Malibu extends Car{
    public Malibu(double maxCapacity, double busyCapacity) {
        super(maxCapacity, busyCapacity);
    }

    @Override
    double maxLongestWay() {
        // Malibu uchun maxLongestWay metodini shakllantirish
        // Ma'lumotlar uchun qo'shimcha shartlar ham qo'shishingiz mumkin
        return busyCapacity / 10; // Masofani boshqa metodlar orqali aniqlang
    }

    @Override
    double getMaxOilFromRefill() {
        // Malibu uchun getMaxOilFromRefill metodini shakllantirish
        // Ma'lumotlar uchun qo'shimcha shartlar ham qo'shishingiz mumkin
        return maxCapacity - busyCapacity;
    }
}
