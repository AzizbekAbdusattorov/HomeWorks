package Lesson_12.Icecream;

public class Main {
    public static void main(String[] args) {
        Milk milk = new Milk(80, 2000);
        Sugar sugar = new Sugar(120, 6000);
        Recipe recipe = new Recipe(2);
        Piece piece = new Piece(0.2, 2000);

        IceCream iceCream = new IceCream(recipe, piece);

        iceCream.addMilk(milk);
        iceCream.addSugar(sugar);

        iceCream.getCount();
        iceCream.buy(5);
        iceCream.getBalance();
        iceCream.hasIceCream();
        iceCream.getInfo();
        iceCream.getProfit();
    }
}
