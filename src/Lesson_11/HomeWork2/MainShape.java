package Lesson_11.HomeWork2;

import Lesson_11.HomeWork2.Circle;
import Lesson_11.HomeWork2.Rectangle;
import Lesson_11.HomeWork2.Shape;
import Lesson_11.HomeWork2.Triangle;

public class MainShape {
    public static void main(String[] args) {
        Shape triangle = new Triangle(3, 4, 5);
        System.out.println(triangle.getPerimeter());
        System.out.println(triangle.getArea());

        Shape rectangle = new Rectangle(3, 4);
        System.out.println(rectangle.getPerimeter());
        System.out.println(rectangle.getArea());

        Shape circle = new Circle(5);
        System.out.println(circle.getPerimeter());
        System.out.println(circle.getArea());
    }
}
