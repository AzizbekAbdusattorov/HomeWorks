package LessonHomework_Abstraction.Car;

public class Captiva extends Car{
    public Captiva(double maxCapacity, double busyCapacity) {
        super(maxCapacity, busyCapacity);
    }

    @Override
    double maxLongestWay() {
        // Captiva uchun maxLongestWay metodini shakllantirish
        // Ma'lumotlar uchun qo'shimcha shartlar ham qo'shishingiz mumkin
        return busyCapacity / 8; // Masofani boshqa metodlar orqali aniqlang
    }

    @Override
    double getMaxOilFromRefill() {
        // Captiva uchun getMaxOilFromRefill metodini shakllantirish
        // Ma'lumotlar uchun qo'shimcha shartlar ham qo'shishingiz mumkin
        return maxCapacity - busyCapacity;
    }
}
