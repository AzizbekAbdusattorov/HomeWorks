package LessonHomework_Abstraction.Shape;

public class Main {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(5, 7);
        Circle circle = new Circle(3);

        // Test qilish
        System.out.println("Rectangle Perimeter: " + rectangle.getPerimeter());
        System.out.println("Rectangle Square: " + rectangle.getSquare());
        System.out.println("Rectangle Side Count: " + rectangle.getSideCount());

        System.out.println("Circle Perimeter: " + circle.getPerimeter());
        System.out.println("Circle Square: " + circle.getSquare());
        System.out.println("Circle Side Count: " + circle.getSideCount());
    }
}
