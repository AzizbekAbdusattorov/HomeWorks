package Lesson_16.Homework1;

public class Main {
    public static void main(String[] args) {
        A aStudent = new A(80, 90, 95);
        B bStudent = new B(75, 85, 90, 88);

        // A sinfi uchun test
        System.out.println("A sinfi talabasi ballari: " + aStudent.getPercentage() + "%");

        // B sinfi uchun test
        System.out.println("B sinfi talabasi ballari: " + bStudent.getPercentage() + "%");

    }
}
