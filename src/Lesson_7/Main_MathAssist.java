package Lesson_7;


public class Main_MathAssist {
    public static void main(String[] args) {
        MathAssist m1 = new MathAssist();

        System.out.println(m1.min(5, 7));

        System.out.println(m1.min(1, 2, 3));

        int  [] numbers = {1, 5, 7, 9, 4 -1};
        System.out.println(m1.min(numbers));

        m1.swap(1, 2);

        m1.swap(2.5, 5.4);

    }
}
