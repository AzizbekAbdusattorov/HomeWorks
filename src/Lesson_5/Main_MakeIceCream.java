package Lesson_5;

public class Main_MakeIceCream {
    public static void main(String[] args) {
        Make_IceCream m1 = new Make_IceCream();
        m1.addMilk(30);
        m1.addSugar(20);

        System.out.println("---- ---- ---- ----");

        System.out.println("Max ice-Cream count: " + m1.maxIceCreamCount(3, 2) + "ta");

        System.out.println("---- ---- ---- ----");

        m1.makeIceCream(3, 2, 10);
    }
}
