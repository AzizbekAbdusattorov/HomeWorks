package Lesson_8.Hard_Drive;

public class File {
    private String name;    // File nomi
    private byte[] data;    // Fayl ma'lumotlari
    private int size;       // Fayl hajmi


    public File(String name, byte[] data) {
        this.name = name;
        this.data = data;
        this.size = data.length;
    }

    // Fayl nomini olish
    public String getName() {
        return name;
    }

    // Fayl ma'lumotlarini olish
    public byte[] getData() {
        return data;
    }

    // Fayl hajmini olish
    public int getSize() {
        return size;
    }
}
