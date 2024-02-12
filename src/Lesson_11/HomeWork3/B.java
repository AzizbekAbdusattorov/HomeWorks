package Lesson_11.HomeWork3;

public class B extends A{
    private int age;

    public B(int age) {
        this.age = age;
    }

    @Override
    int getAge() {
        return age;
    }
}
