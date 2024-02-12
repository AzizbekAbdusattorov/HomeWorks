package Lesson_7;

public class IntegerAssist {
    int number;

    IntegerAssist(int number){
        this.number = number;

        int newNumber = 0;
        while (number > 0){
            newNumber = (newNumber * 10) + (number % 10);
            number /= 10;
        }

        System.out.println(newNumber);
    }

    int polindrom(){
        int newNumber = 0;
        while (number > 0){
            newNumber = (newNumber * 10) + (number % 10);
            number /= 10;
        }

        return newNumber;
    }
}
