package Lesson_25.Lesson_26;

import Lesson_25.homework1.MyArrayList;

import java.util.Random;
import java.util.Scanner;

public class LoginApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        MyArrayList<String> telephoneNumbers = new MyArrayList<>();
        MyArrayList<Integer> smsNumber = new MyArrayList<>();
        MyArrayList<String> users = new MyArrayList<>();
        MyArrayList<String> passwords = new MyArrayList<>();
        int choice = 0; // tanlash
        while (choice != 4) {
            System.out.println("Uzum Bankga xush kelibsiz: ");
            System.out.println("1. Roʻyxatdan oʻtish");
            System.out.println("2. Karta qo'shish");
            System.out.println("3. Karta malumotlariga kirish");
            System.out.println("4. Chiqish");
            choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 1:
                    System.out.print("Telefon raqamingizni kiriting: ");
                    String phoneNumber = scanner.nextLine();
                    if (telephoneNumbers.contains(phoneNumber)) {
                        System.out.println("Bu raqam allaqachon ro'yxatdan o'tgan");
                    } else {
                        telephoneNumbers.add(phoneNumber);
                        System.out.print("Raqamingizga kelgan kodni kiriting: ");
                        int code = getRandom();
                        if (smsNumber.contains(code)) {
                            getRandom();
                        } else {
                            System.out.println(code);
                            int sms = scanner.nextInt();
                            if (code == sms) {
                                System.out.println("Muvaffaqiyatli ro'yxatdan o'tdingiz!");
                            } else {
                                System.out.println("Code xato");
                            }
                        }
                    }
                    break;
                case 2:
                    System.out.print("Karta raqami (**** **** **** ****): ");
                    String username = scanner.nextLine();
                    System.out.print("Amal qilish sanasi (OO/YY): ");
                    String password = scanner.nextLine();
                    if (users.contains(username)) {
                        System.out.println("Bu karta raqam allaqachon ro'yxatdan o'tgan.");
                    } else {
                        users.add(username);
                        passwords.add(password);
                        System.out.println("Roʻyxatdan oʻtish muvaffaqiyatli.");
                    }
                    break;
                case 3:
                    System.out.print("Karta raqami (**** **** **** ****): ");
                    String username1 = scanner.nextLine();
                    System.out.print("Amal qilish sanasi (OO/YY): ");
                    String password1 = scanner.nextLine();
                    if (!(users.contains(username1) || passwords.contains(password1))) {
                        System.out.println("Karta raqami yoki Amal qilish sanasi xato.");
                    } else {
                        System.out.println("Kirish muvaffaqiyatli.");
                    }
                    break;
                case 4:
                    choice = 4;
                    break;
                default:
                    System.out.println("Yaroqsiz tanlov.");
            }
        }
    }

    static int getRandom() {
        return new Random().nextInt(1000, 9999);
    }
}

