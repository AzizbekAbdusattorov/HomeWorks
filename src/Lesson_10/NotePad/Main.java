package Lesson_10.NotePad;

public class Main {
    public static void main(String[] args) {
        Pen redPen = new Pen("Red");
        Pen bluePen = new Pen("Blue");

        NotePad notePad = new NotePad(3);

        notePad.addNote(redPen, "Note 1");
        notePad.addNote(bluePen, "Note 2");
        notePad.addNote(redPen, "Note 3");

        notePad.editNote(redPen, "Note 1 edited");

        notePad.removeNote("Note 2");

        System.out.println("Jami notelar soni: " + notePad.getNoteCount());
        System.out.println("Qizil rangdagi notelar soni: " + notePad.getNoteCount("Red"));
    }
}
