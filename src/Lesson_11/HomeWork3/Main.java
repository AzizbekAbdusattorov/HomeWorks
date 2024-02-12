package Lesson_11.HomeWork3;

public class Main {
    public static void main(String[] args) {
        B b1 = new B(25);
        B b2 = new B(25);
        B b3 = new B(30);

        // equals metodini ishlatish
        System.out.println("b1.equals(b2): " + b1.equals(b2)); // true
        System.out.println("b1.equals(b3): " + b1.equals(b3)); // false
    }
}
