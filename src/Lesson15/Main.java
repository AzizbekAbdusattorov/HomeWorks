package Lesson15;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (true){

            switch (in.nextLine()){
                case "SPRING": {
                    Season season = Season.SPRING;
                    season.month(3);
                } break;
                case "SUMMER": {
                    Season season = Season.SUMMER;
                    season.month(6);
                } break;
                case "AUTUMN": {
                    Season season = Season.AUTUMN;
                    season.month(9);
                } break;
                case "WINTER": {
                    Season season = Season.WINTER;
                    season.month(12);
                } break;
            }

        }
    }
}
