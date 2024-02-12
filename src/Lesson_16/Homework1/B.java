package Lesson_16.Homework1;

public class B implements Ballar{
    private int fan1;
    private int fan2;
    private int fan3;
    private int fan4;

    public B(int fan1, int fan2, int fan3, int fan4) {
        this.fan1 = fan1;
        this.fan2 = fan2;
        this.fan3 = fan3;
        this.fan4 = fan4;
    }

    @Override
    public double getPercentage() {
        return (fan1 + fan2 + fan3 + fan4) / 4.0;
    }
}
