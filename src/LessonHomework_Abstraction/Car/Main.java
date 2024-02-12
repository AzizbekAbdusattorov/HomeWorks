package LessonHomework_Abstraction.Car;

public class Main {
    public static void main(String[] args) {
        Malibu malibu = new Malibu(60, 20);
        Captiva captiva = new Captiva(80, 30);

        // Test qilish
        System.out.println("Malibu maxLongestWay: " + malibu.maxLongestWay());
        System.out.println("Malibu getMaxOilFromRefill: " + malibu.getMaxOilFromRefill());

        System.out.println("Captiva maxLongestWay: " + captiva.maxLongestWay());
        System.out.println("Captiva getMaxOilFromRefill: " + captiva.getMaxOilFromRefill());

    }
}
