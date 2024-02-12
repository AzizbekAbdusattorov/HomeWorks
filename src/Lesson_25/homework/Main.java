package Lesson_25.homework;

public class Main {
    public static void main(String[] args) {

        MyList m1 = new MyArrayList<>();
        MyList m2 = new MyArrayList<>();
        m1.add(1);
        m1.add(2);
        m1.add(3);
        m1.add(4);
        m1.add(5);
        m1.add(6);
        m2.add(1);
        m2.add(1);
        m2.add(1);
        System.out.println(m1.remove(6));


    }
}
