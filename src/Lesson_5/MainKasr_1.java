package Lesson_7.Lesson_5;

import java.util.Scanner;

public class MainKasr_1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Kasr_1 k1 = new Kasr_1();
        System.out.print("Birinchi kasrni surati: ");
        k1.surat = in.nextInt();
        System.out.print("Birinchi kasrni maxraji: ");
        k1.maxraj = in.nextInt();

        System.out.println("---- ---- ---- ----");

        Kasr_1 k2 = new Kasr_1();
        System.out.print("Ikkikchi kasrni surati: ");
        k2.surat = in.nextInt();
        System.out.print("Ikkinchi kasrni maxraji: ");
        k2.maxraj = in.nextInt();

        System.out.print("1-Kasr: ");
        k1.showInfo();
        System.out.print("2-Kasr: ");
        k2.showInfo();

        System.out.println("---- ---- ---- ----");

        Kasr_1 add = new Kasr_1();
        System.out.print("Ikkita kasrni qo'shsak: ");
        add.addTwoKasr(k1, k2);
        add.showInfo();

        System.out.println("---- ---- ---- ----");

        Kasr_1 multiply = new Kasr_1();
        System.out.print("Ikkita kasrni ko'paytirsak: ");
        multiply.multiplyTwoKasr(k1, k2);
        multiply.showInfo();

        System.out.println("---- ---- ---- ----");

        Kasr_1 division = new Kasr_1();
        System.out.print("Ikkita kasrni bo'lsak: ");
        division.divisionTwoKasr(k1, k2);
        division.showInfo();

    }
}
