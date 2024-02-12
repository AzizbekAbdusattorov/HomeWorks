package Lesson_18.Homework2;


import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> footballPlayers = new ArrayList<>();
        ArrayList<String> tennisPlayers = new ArrayList<>();

        footballPlayers.add("B2");
        footballPlayers.add("A2");
        footballPlayers.add("A3");

        tennisPlayers.add("A2");
        tennisPlayers.add("B2");
        tennisPlayers.add("B3");

       footballPlayers.removeAll(tennisPlayers);
        System.out.println("Faqat futbolga boradiganlar: " + footballPlayers);

        ArrayList<String> allPlayers = new ArrayList<>(footballPlayers);
        allPlayers.addAll(tennisPlayers);
        System.out.println("Barcha o'yinchilar soni: " + allPlayers.size());
    }
}
