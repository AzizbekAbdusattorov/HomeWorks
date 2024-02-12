package Lesson_5;

public class MainKasr {
    public static void main(String[] args) {
        Kasr k1 = new Kasr();
        k1.surat = 3;
        k1.maxraj = 5;

        Kasr k2 = new Kasr();
        k2.surat = 4;
        k2.maxraj = 5;


        k1.showInfo();
        k2.showInfo();

        Kasr sum = new Kasr();
        sum.addTwoKasr(k1, k2);
        sum.showInfo();

        Kasr product = new Kasr();
        product.multiplyTwoKasr(k1, k2);
        product.showInfo();

        Kasr quotient = new Kasr();
        quotient.divisionTwoKasr(k1, k2);
        quotient.showInfo();

    }
}
