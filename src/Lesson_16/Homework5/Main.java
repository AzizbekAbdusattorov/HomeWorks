package Lesson_16.Homework5;

public class Main {
    public static void main(String[] args) {
        // Creating University object
        University university = new University("Example University", "City");

        // Creating Student objects
        University.Student student1 = university.new Student("John", "Doe", 2);
        University.Student student2 = university.new Student("Alice", "Smith", 3);

        // Showing student info
        student1.showInfo();
        System.out.println(); // Empty line for separation
        student2.showInfo();
    }
}
