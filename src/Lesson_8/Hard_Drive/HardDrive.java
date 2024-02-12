package Lesson_8.Hard_Drive;

public class HardDrive {
    private byte[] storage;     // saqlash massiv
    private int usedSpace;      // ishlatilgan joy
    private int totalSpace;     // Umumiy joy

    public HardDrive(int totalSpace) {
        this.totalSpace = totalSpace;
        this.storage = new byte[totalSpace];
        this.usedSpace = 0;
    }

    // Faylni yozish metodi
    public void write(File file) {
        // Faylni yozish uchun joyni tekshiramiz
        if (usedSpace + file.getSize() > totalSpace) {
            System.out.println("Diskda yetarli jo'y mavjud emas!");
            return;
        }

        // Faylni yozish
        System.arraycopy(file.getData(), 0, storage, usedSpace, file.getSize());
        usedSpace += file.getSize();
        System.out.println("Fayl yozildi: " + file.getName());
    }

    // Faylni o'chirish metodi
    public void remove(File file) {
        int fileSize = file.getSize();
        for (int i = 0; i < fileSize; i++) {
            storage[usedSpace - fileSize + i] = 0;
        }

        usedSpace -= fileSize;
        System.out.println("Fayl o'chirildi: " + file.getName());
    }

    // Joyni tozalash metodi
    public void clear() {
        for (int i = 0; i < usedSpace; i++) {
            storage[i] = 0;
        }
        usedSpace = 0;
        System.out.println("Joyni tozalash amalga oshirildi");
    }

    // Ishlatilgan joyni olish
    public int getUsedSpace() {
        return usedSpace;
    }

    // Joyni to'liq ishlatib bo'lmagan joyni olish
    public int getFreeSpace() {
        return totalSpace - usedSpace;
    }

    // Joyni tekshirish
    public boolean isEmpty() {
        return usedSpace == 0;
    }

    // Joyni to'la o'qish
    public boolean isFull() {
        return usedSpace == totalSpace;
    }

}
