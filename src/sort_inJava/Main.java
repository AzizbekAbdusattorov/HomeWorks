package sort_inJava;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        int[] mas = new int[n];
        for (int i = 0; i < n; i++) {
            mas[i] = in.nextInt();
        }

        for (int i = 0; i < n - 1; i++) {

            for (int j = i; j < n; j++) {
                if (mas[i] >= mas[j] && (mas[i] / 2 == 0 && mas[j] / 2 == 0) && i != j) {
                    int temp = mas[i];
                    mas[i] = mas[j];
                    mas[j] = temp;
                }
            }

            for (int j = i; j < n; j++) {
                if (mas[i] >= mas[j] && (mas[i] / 2 == 1 && mas[j] / 2 == 1) && i != j) {
                    int temp = mas[i];
                    mas[i] = mas[j];
                    mas[j] = temp;
                }
            }

        }

        for (int i = 0; i < n; i++) {
            System.out.print(mas[i] + " ");
        }

    }
}
