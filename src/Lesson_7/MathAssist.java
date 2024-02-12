package Lesson_7;

public class MathAssist {
    int min(int a, int b) {
        if (a < b) {
            return a;
        } else {
            return b;
        }
    }

    int min(int a, int b, int c) {
        if (a < b && a < c) {
            return a;
        } else if (b < a && b < c) {
            return b;
        } else {
            return c;
        }
    }

    int min(int [] mass){
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < mass.length; i++) {
            if (mass[i] < min){
                min = mass[i];
            }
        }
        return min;
    }

    void swap(int a, int b) {
        a = a + b;

        b = a - b;
        a = a - b;

        System.out.println(a + " " + b);
    }

    void swap(double a, double b){
        a = a + b;

        b = a - b;
        a = a- b;

        System.out.println(a + " " + b);
    }


}
