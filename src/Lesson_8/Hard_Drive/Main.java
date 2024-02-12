package Lesson_8.Hard_Drive;

public class Main {
    public static void main(String[] args) {
        HardDrive h1 = new HardDrive(100);

        byte[] file1Data = "Hello, World".getBytes();
        File f1 = new File("file1.txt", file1Data);

        byte[] file2Data = "Java is fun!".getBytes();
        File f2 = new File("file2.txt", file2Data);

        h1.write(f1);
        h1.write(f2);

        System.out.println("Diskda ishlatilgan joy: " + h1.getUsedSpace() + " bayt");
        System.out.println("Diskda to'liq bo'sh joy: " + h1.getFreeSpace() + " bayt");

        h1.remove(f1);

        System.out.println("Diskda ishlatilgan joy: " + h1.getUsedSpace() + " bayt");
        System.out.println("Diskda to'liq bo'sh joy: " + h1.getFreeSpace() + " bayt");

        h1.clear();

        System.out.println("Diskda ishlatilgan joy: " + h1.getUsedSpace() + " bayt");
        System.out.println("Diskda to'liq bo'sh joy: " + h1.getFreeSpace() + " bayt");

        System.out.println(h1.isEmpty());
    }
}
