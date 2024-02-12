package LessonHomework_Abstraction.LessonAndStudent;

public class Lesson {
    private String lessonName;
    private int hoursPerWeek;

    public Lesson(String lessonName, int hoursPerWeek) {
        this.lessonName = lessonName;
        this.hoursPerWeek = hoursPerWeek;
    }

    public String getLessonName() {
        return lessonName;
    }

    public int getHoursPerWeek() {
        return hoursPerWeek;
    }
}
