package Lesson_7.Lesson_5;

public class MathAssistent {

    int number;


    int pow(int degree) {
        int multiplication = 1;
        for (int i = 0; i < degree; i++) {
            multiplication *= number;
        }
        return multiplication;
    }


    int summDigitsNumber() {
        int sum = 0;
        while (number > 0) {
            sum += number % 10;
            number /= 10;
        }

        return sum;
    }
}
