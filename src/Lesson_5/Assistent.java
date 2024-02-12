package Lesson_5;

public class Assistent {

    static int addTwoNumber(int a, int b){
        a += b;

        return a;
    }

    int pow(int a, int b){
        int multiplication = 1;
        for (int i = 0; i < b; i++) {
            multiplication *= a;
        }

        return multiplication;
    }

    int abs(int a){
        if (a > 0){
            return a;
        } else {
            a *= -1;
            return a;
        }
    }

    int getWholeSection(double a) {
        double b = a * 10;

        if (a > 0) {

            if (b % 10 > 5) {
                a += 1;
                return (int) a;
            } else {
                return (int) a;
            }

        } else {

            if (b % 10 > 5) {
                return (int) a;
            } else {
                a -= 1;
                return (int) a;
            }

        }

    }


}
