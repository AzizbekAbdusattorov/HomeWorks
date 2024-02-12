package Lesson_16.Homework2;

public class Peach extends Fruit{
    public Peach(String color, double weight) {
        super("Peach", color, weight);
    }

    @Override
    public void showInfo() {
        System.out.println("Peach: Color - " + color + ", Weight - " + weight + "kg");
    }
}
