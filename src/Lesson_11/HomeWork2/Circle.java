package Lesson_11.HomeWork2;

import Lesson_11.HomeWork2.Shape;

public class Circle extends Shape { // circle -> doira


    public Circle(double a) {
        super(a);
    }

    @Override
    public double getPerimeter() {
        return 2 * Math.PI * getA();
    }

    @Override
    public double getArea() {
        return Math.PI * getA() * getA();
    }
}
