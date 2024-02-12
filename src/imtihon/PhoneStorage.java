package imtihon;

public class PhoneStorage { // telefon xotirasi
    int storage;
    int busyPart; // band qismi

    // Shu class ning 2 ta argument qabul qiladigan constructori
    PhoneStorage(int storage, int busyPart) {
        // Constructorga boshlang'ich qiymatlar tashqi tarafdan keladi
        // Bu kelgan qiymatlarni shu class dagi fiedlarga o'zlashtirib olamiz
        // O'zlashtirib olingan code pastda yozib oldik

        this.storage = storage;
        this.busyPart = busyPart;

        System.out.println("Telefon xotirasi : " + storage + " GB");
        System.out.println("Telefon xotirasinig band qismi   : " + busyPart + " GB");
    }

    int getEmptyStorage() { // bo'sh joy oling (xotira)
        int k = storage - busyPart;
        return k;
    }

    void addMusic(int musicSize) {
        if (musicSize > getEmptyStorage()){
            System.out.println("Xotira to'lib qolgan musiqa qo'sha olmaysiz! " + " " +musicSize + "GB");
        } else {
            System.out.println("Musiqa muvafaqiyatli qo'shildi!" + " " + musicSize + "GB");
        }
    }

    boolean addMusics(int musicSize, int count) {
        int allMusicSize = musicSize * count;
        return allMusicSize < getEmptyStorage();
    }
}
