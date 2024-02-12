package LessonHomework_Abstraction.LessonAndStudent;

public class Main {
    public static void main(String[] args) {
        Limit limit = new Limit(20);
        Student student = new Student("Anna", 18, limit);
        Lesson lesson = new Lesson("Programming", 5);

        student.addLesson(lesson);

        System.out.println("Is full lesson: " + student.isFullLesson());
        student.showLessons();
        student.show();
        System.out.println("Weekly limit: " + student.showLimit());

    }
}
