package Lesson_18.Homework001;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        ATM atm = new ATM();
        MessageInterface messageListener = message -> System.out.println(message);
        ShowMoneyInfoInterface moneyInfoListener = (amount, count) ->
                System.out.println(amount + " dan " + count + " ta");

        atm.setMessageListener(messageListener);
        atm.setShowMoneyInfoInterface(moneyInfoListener);

        boolean exit = true;

        while (exit) {
            System.out.println("\n Bittasini tanlang:");
            System.out.println("1 -> Pul Qo'shish: ");
            System.out.println("2 -> Pul yechib olish: ");
            System.out.println("3 -> Pul malumotlari: ");
            System.out.println("4 -> Balance");
            System.out.println("5 -> Chiqish");

            switch (in.nextInt()) {
                case 1:
                    System.out.print("Qo'shiladigan pul miqdori: ");
                    int moneyAmount = in.nextInt();
                    atm.addMoneys(createMoneyList(moneyAmount));
                    messageListener.showMessage("Pul muvaffaqiyatli qo'shildi: ");
                    break;

                case 2:
                    System.out.println("Olinadigan pul miqdori: ");
                    int withdrawnAmount = in.nextInt();
                    atm.isGetMoney(withdrawnAmount);
                    break;

                case 3: atm.moneysInfo();
                break;

                case 4:
                    System.out.println("Joriy balans: " + atm.getBalance());
                    break;

                case 5: exit = false;
                break;

                default:
                    System.out.println("Error: boshqattan tanlang");
                    break;

            }

        }

    }

    private static ArrayList<Money> createMoneyList(int amount) {
        ArrayList<Money> moneyList = new ArrayList<>();
        moneyList.add(new Money(amount));
        return moneyList;
    }
}
