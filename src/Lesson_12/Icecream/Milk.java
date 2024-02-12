package Lesson_12.Icecream;

public class Milk {
    private double volume;
    private double pricePerLiter;

    public Milk(double volume, double pricePerLiter) {
        this.volume = volume;
        this.pricePerLiter = pricePerLiter;
    }

    public double getCost() {
        return volume * pricePerLiter;
    }
}
