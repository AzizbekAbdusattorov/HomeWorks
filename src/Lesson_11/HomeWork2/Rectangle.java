package Lesson_11.HomeWork2;

import Lesson_11.HomeWork2.Shape;

public class Rectangle extends Shape { // rectangle -> to'rtburchak

    public Rectangle(double a, double b) {
        super(a, b);
    }

    @Override
    public double getPerimeter() {
        return 2 * (getA() + getB());
    }

    @Override
    public double getArea() {
        return getA() * getB();
    }
}
