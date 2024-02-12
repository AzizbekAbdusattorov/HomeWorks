package Lesson_5;

public class MainMathAssistent {
    public static void main(String[] args) {
        MathAssistent m1 = new MathAssistent();
        m1.number = 15;

        System.out.println(m1.pow(2));

        System.out.println(m1.summDigitsNumber());
    }
}
