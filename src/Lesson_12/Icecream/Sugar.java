package Lesson_12.Icecream;

public class Sugar {
    private double weight;
    private double pricePerKg;

    public Sugar(double weight, double pricePerKg) {
        this.weight = weight;
        this.pricePerKg = pricePerKg;
    }

    public double getCost() {
        return weight * pricePerKg;
    }
}
