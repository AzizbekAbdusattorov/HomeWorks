package Lesson_10.NotePad;

import java.util.ArrayList;
import java.util.List;

public class NotePad {
    private int size;
    private List<String> notes;
    private List<Pen> pens;

    public NotePad(int size) {
        this.size = size;
        this.notes = new ArrayList<>();
        this.pens = new ArrayList<>();
    }

    public boolean addNote(Pen pen, String note) {
        if (!notes.contains(note) && notes.size() < size) {
            notes.add(note);
            pens.add(pen);
            System.out.println("Note qo'shildi: " + note);
            return true;
        } else {
            System.out.println("Note qo'shish mumkin emas yoki oldin yozilgan!");
            return false;
        }
    }

    public void editNote(Pen pen, String note) {
        int index = notes.indexOf(note);
        if (index != -1) {
            pens.set(index, pen);
            System.out.println("Note o'zgartirildi: " + note);
        } else {
            System.out.println("Bunday note topilmadi!");
        }
    }

    public boolean editNote(String oldNote, String newNote) {
        int index = notes.indexOf(oldNote);
        if (index != -1) {
            notes.set(index, newNote);
            System.out.println("Note o'zgartirildi: " + oldNote + " -> " + newNote);
            return true;
        } else {
            System.out.println("Bunday note topilmadi!");
            return false;
        }
    }

    public boolean removeNote(String note) {
        int index = notes.indexOf(note);
        if (index != -1) {
            notes.remove(index);
            pens.remove(index);
            System.out.println("Note o'chirildi: " + note);
            return true;
        } else {
            System.out.println("Bunday note topilmadi!");
            return false;
        }
    }

    public int getNoteCount() {
        return notes.size();
    }

    public int getNoteCount(String colorName) {
        int count = 0;
        for (int i = 0; i < notes.size(); i++) {
            if (pens.get(i).getColor().equals(colorName)) {
                count++;
            }
        }
        return count;
    }
}
