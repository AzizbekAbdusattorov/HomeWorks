package Lesson_16.Homework5;

public class University {
    String name;
    String location;

    University(String name, String location) {
        this.name = name;
        this.location = location;
    }

    // Student inner class
    class Student {
        String firstName;
        String lastName;
        int course;

        Student(String firstName, String lastName, int course) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.course = course;
        }

        void showInfo() {
            System.out.println("University: " + name);
            System.out.println("Location: " + location);
            System.out.println("Student Info:");
            System.out.println("Name: " + firstName + " " + lastName);
            System.out.println("Course: " + course);
        }
    }
}
