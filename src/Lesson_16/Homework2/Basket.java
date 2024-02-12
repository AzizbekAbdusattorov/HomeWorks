package Lesson_16.Homework2;

public class Basket {
    private final double maxWeight;
    private double currentWeight;

    public Basket(double maxWeight) {
        this.maxWeight = maxWeight;
        this.currentWeight = 0;
    }

    public boolean isEmpty() {
        return currentWeight == 0;
    }

    public boolean isFull() {
        return currentWeight == maxWeight;
    }

    private boolean addFruit(Fruit fruit) {
        if (currentWeight + fruit.weight <= maxWeight) {
            currentWeight += fruit.weight;
            return true;
        }
        return false;
    }

    public boolean addFruit(Apple apple) {
        return addFruit((Fruit) apple);
    }

    public boolean addFruit(Peach peach) {
        return addFruit((Fruit) peach);
    }

    public boolean addFruit(Pomegranate pomegranate) {
        return addFruit((Fruit) pomegranate);
    }

    public int getEmptySize() {
        return (int) (maxWeight - currentWeight);
    }

    public boolean addFruits(Fruit[] fruits) {
        for (Fruit fruit : fruits) {
            if (!addFruit(fruit)) {
                return false;
            }
        }
        return true;
    }
}
