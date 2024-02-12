package Lesson_16.Homework1;

public class A implements Ballar{
    private int fan1;
    private int fan2;
    private int fan3;

    public A(int fan1, int fan2, int fan3) {
        this.fan1 = fan1;
        this.fan2 = fan2;
        this.fan3 = fan3;
    }

    @Override
    public double getPercentage() {
        return (fan1 + fan2 + fan3) / 3.0;
    }
}
