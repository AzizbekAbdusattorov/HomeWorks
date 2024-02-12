package Lesson_5;

public class Kasr_1 {
    int surat;
    int maxraj;


    void showInfo() {
        System.out.println(surat + "/" + maxraj);
    }

    void addTwoKasr(Kasr_1 a, Kasr_1 b) {
        if (a.maxraj == b.maxraj){
            this.surat = a.surat + b.surat;
            this.maxraj = a.maxraj;
        } else {
            this.surat = a.surat * b.maxraj + a.maxraj * b.surat;
            this.maxraj = a.maxraj * b.maxraj;
        }
    }

    void multiplyTwoKasr(Kasr_1 a, Kasr_1 b) {
        this.surat = a.surat * b.surat;
        this.maxraj = a.maxraj * b.maxraj;
    }

    void divisionTwoKasr(Kasr_1 a, Kasr_1 b) {
        this.surat = a.surat * b.maxraj;
        this.maxraj = a.maxraj * b.surat;
    }

}
