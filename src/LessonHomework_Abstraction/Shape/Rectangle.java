package LessonHomework_Abstraction.Shape;

public class Rectangle extends Shape{
    private double length;
    private double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    double getPerimeter() {
        return 2 * (length + width);
    }

    @Override
    double getSquare() {
        return length * width;
    }

    @Override
    int getSideCount() {
        return 4;
    }
}
