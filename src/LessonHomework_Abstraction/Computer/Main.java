package LessonHomework_Abstraction.Computer;

public class Main {
    public static void main(String[] args) {
        Acer acer = new Acer("Intel Core i5", 512);
        HP hp = new HP("AMD Ryzen 7", 256);
        MSI msi = new MSI("Intel Core i7", 1024);

        // Test qilish
        acer.showInfo();
        System.out.println();

        hp.showInfo();
        System.out.println();

        msi.showInfo();
    }
}
