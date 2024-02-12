package Lesson_8.Basket;

public class Main {
    public static void main(String[] args) {
        Basket basket = new Basket(new Capacity(10));


        Fruit fruit1 = new Fruit("Granate", "Red", 4);
        Fruit fruit2 = new Fruit("Nok", "White", 2);


        basket.addFruits(new Fruit[]{fruit1, fruit2});
        System.out.println(basket.isFull());
    }
}
