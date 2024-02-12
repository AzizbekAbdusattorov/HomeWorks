package Lesson_11.HomeWork2;

public abstract class Shape {  // shape -> shakl

    private double a;
    private double b;
    private double c;

    public Shape(double a) {
        this.a = a;
    }

    public Shape(double a, double b){
        this.a = a;
        this.b = b;
    }

    public Shape(double a, double b, double c){
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public abstract double getPerimeter();
    public abstract double getArea();

    public double getA() {
        return a;
    }

    public double getB(){
        return b;
    }

    public double getC() {
        return c;
    }
}
