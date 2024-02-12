package Lesson_16.Homework2;

public class Pomegranate extends Fruit{
    public Pomegranate(String color, double weight) {
        super("Pomegranate", color, weight);
    }

    @Override
    public void showInfo() {
        System.out.println("Pomegranate: Color - " + color + ", Weight - " + weight + "kg");
    }
}
