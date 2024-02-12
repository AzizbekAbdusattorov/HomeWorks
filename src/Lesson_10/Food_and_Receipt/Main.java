package Lesson_10.Food_and_Receipt;

public class Main {
    public static void main(String[] args) {
        Apple apple = new Apple(5);

        Receipt receipt = new Receipt();
        receipt.addIngredient(apple, 3);

        Food food = new Food(receipt);
        food.add(apple);
        food.add(apple);

        System.out.println("Receipt tarkibi:");
        receipt.show();

        System.out.println("Food tayyorlandimi: " + food.hasFood());
    }
}
