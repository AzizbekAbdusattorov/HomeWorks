package Lesson_12.Icecream;

public class Piece {
    private double weight;
    private double price;

    public Piece(double weight, double price) {
        this.weight = weight;
        this.price = price;
    }

    public double getCost() {
        return weight * price;
    }
}
