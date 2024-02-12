package Lesson_16.Homework4;

public class Main {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(5, 8);
        Circle circle = new Circle(4);

        // Using the methods
        System.out.println("Rectangle Perimeter: " + rectangle.getPerimeter());
        System.out.println("Rectangle Square: " + rectangle.getSquare());

        System.out.println("Circle Perimeter: " + circle.getPerimeter());
        System.out.println("Circle Square: " + circle.getSquare());
    }
}
