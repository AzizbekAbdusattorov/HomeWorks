package Lesson_16.Homework2;

public abstract class Fruit {
    protected String name;
    protected String color;
    protected double weight;

    public Fruit(String name, String color, double weight) {
        this.name = name;
        this.color = color;
        this.weight = weight;
    }

    public abstract void showInfo();
}
