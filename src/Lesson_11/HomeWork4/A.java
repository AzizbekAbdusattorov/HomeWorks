package Lesson_11.HomeWork4;

public class A {
    private static A instance;

    private A() {
        // private construktor
    }

    public static A getInstance() {
        if (instance == null) {
            instance = new A();
        }
        return instance;
    }
}
