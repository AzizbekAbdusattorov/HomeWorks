package Lesson_11.HomeWork4;

public class Main {
    public static void main(String[] args) {
        A a1 = A.getInstance();
        A a2 = A.getInstance();

        // a1 va a2 bir xil obyektmi?
        System.out.println("a1 == a2: " + (a1 == a2)); // true
    }
}
