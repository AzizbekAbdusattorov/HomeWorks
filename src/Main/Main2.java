package Main;

import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int number = in.nextInt();

        int newNumber = 0;
        while (number > 0){

            newNumber = (newNumber * 10) + (number % 10);
            number /= 10;

        }

        System.out.println(number);
        System.out.println(newNumber);

    }
}
