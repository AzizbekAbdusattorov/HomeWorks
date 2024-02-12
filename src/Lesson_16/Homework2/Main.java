package Lesson_16.Homework2;

public class Main {
    public static void main(String[] args) {
        Basket basket = new Basket(10);

        Apple apple = new Apple("Red", 0.5);
        Peach peach = new Peach("Yellow", 0.7);
        Pomegranate pomegranate = new Pomegranate("Red", 1.0);

        Fruit[] fruits = {apple, peach, pomegranate};

        System.out.println("Basket is empty: " + basket.isEmpty());
        System.out.println("Basket is full: " + basket.isFull());
        System.out.println("Empty size in the basket: " + basket.getEmptySize());

        System.out.println("Adding fruits to the basket: " + basket.addFruits(fruits));

        System.out.println("Basket is empty: " + basket.isEmpty());
        System.out.println("Basket is full: " + basket.isFull());
        System.out.println("Empty size in the basket: " + basket.getEmptySize());

    }
}
