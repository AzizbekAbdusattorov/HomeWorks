package LessonHomework_Abstraction.LessonAndStudent;
import java.util.ArrayList;
import java.util.List;
public class Student {
    private String name;
    private int age;
    private Limit limit;
    private List<Lesson> lessons;

    public Student(String name, int age, Limit limit) {
        this.name = name;
        this.age = age;
        this.limit = limit;
        this.lessons = new ArrayList<>();
    }

    public boolean addLesson(Lesson lesson) {
        if (!isFullLesson()) {
            lessons.add(lesson);
            return true;
        }
        return false;
    }

    public boolean isFullLesson() {
        int totalHours = 0;
        for (Lesson studentLesson : lessons) {
            totalHours += studentLesson.getHoursPerWeek();
        }

        return totalHours >= limit.getWeeklyLimit();
    }


    public void showLessons() {
        System.out.println("Student's lessons:");
        for (Lesson lesson : lessons) {
            System.out.println("- " + lesson.getLessonName());
        }
    }

    public void show() {
        System.out.println("Student's information:");
        System.out.println("Name: " + name + ", Age: " + age + ", Limit: " + lessons.size() + "/" + limit.getWeeklyLimit());
    }

    public int showLimit() {
        return limit.getWeeklyLimit();
    }
}
