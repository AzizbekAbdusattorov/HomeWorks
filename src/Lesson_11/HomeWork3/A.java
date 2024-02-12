package Lesson_11.HomeWork3;

public abstract class A {
    abstract int getAge();

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        A other = (A) obj;
        return getAge() == other.getAge();
    }
}
