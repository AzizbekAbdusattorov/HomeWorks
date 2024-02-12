package Lesson_9.Telegram;

public class User {
    private String lastName;
    private String firstName;
    private int age;
    private String phoneNumber;

    public User(String lastName, String firstName, int age, String phoneNumber) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.age = age;
        this.phoneNumber = phoneNumber;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }
}
