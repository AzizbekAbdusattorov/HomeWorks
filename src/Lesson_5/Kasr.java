package Lesson_7.Lesson_5;

public class Kasr {

    int surat;
    int maxraj;


    void showInfo() {
        System.out.println(surat + "/" + maxraj);
    }

    void addTwoKasr(Kasr a, Kasr b) { // qo'shish
        if (a.maxraj == b.maxraj){
            this.surat = a.surat + b.surat;
            this.maxraj = a.maxraj;
        } else {
            this.surat = a.surat * b.maxraj + b.surat * a.maxraj;
            this.maxraj = a.maxraj * b.maxraj;
        }

    }


    void multiplyTwoKasr(Kasr a, Kasr b){  // ko'paytirmoq
        this.surat = a.surat * b.surat;
        this.maxraj = a.maxraj * b.maxraj;
    }

    void divisionTwoKasr(Kasr a, Kasr b){  // bo'lish
        this.surat = a.surat * b.maxraj;
        this.maxraj = a.maxraj * b.surat;
    }


}
