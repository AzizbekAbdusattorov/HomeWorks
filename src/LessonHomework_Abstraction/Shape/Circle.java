package LessonHomework_Abstraction.Shape;

public class Circle extends Shape{
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    @Override
    double getSquare() {
        return Math.PI * Math.pow(radius, 2);
    }

    @Override
    int getSideCount() {
        return 0; // Doyaldan kelib chiqqan shaklarda tomonlar soni yo'q.
    }
}
