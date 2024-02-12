package Lesson_11.HomeWork2;

import Lesson_11.HomeWork2.Shape;

public class Triangle extends Shape { // triangle -> uchburchak

    public Triangle(double a, double b, double c) {
        super(a, b, c);
    }

    @Override
    public double getPerimeter() {
        return getA() + getB() + getC();
    }

    @Override
    public double getArea() {
        double halfPr = getPerimeter() / 2;
        return Math.sqrt(halfPr * (halfPr - getA()) * (halfPr - getB()) * (halfPr - getC()) );
    }
}
