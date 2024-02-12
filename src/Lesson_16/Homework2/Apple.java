package Lesson_16.Homework2;

public class Apple extends Fruit{
    public Apple(String color, double weight) {
        super("Apple", color, weight);
    }

    @Override
    public void showInfo() {
        System.out.println("Apple: Color - " + color + ", Weight - " + weight + "kg");
    }
}
