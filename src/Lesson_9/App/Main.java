package Lesson_9.App;

public class Main {
    public static void main(String[] args) {
        App telegram = new App("Telegram", 7);
        App instagram = new App("Instagram", 10);

        Device device = new Device(120);

        device.install(telegram);
        device.install(instagram);

        device.showApps();

        device.uninstall("Telegram");

        device.run("Instagram");

        device.info();
    }
}
