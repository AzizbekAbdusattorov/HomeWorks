package Lesson_9.App;

import java.util.ArrayList;
import java.util.List;

public class Device {
    private int storage;
    private List<App> installedApps;
    private App runningApp;

    public Device(int storage) {
        this.storage = storage;
        this.installedApps = new ArrayList<>();
        this.runningApp = null;
    }

    public boolean install(App app) {
        // Dastur nomlari bir xil bo'lsa o'rnatmaymiz
        for (App installedApp : installedApps) {
            if (installedApp.getName().equals(app.getName())) {
                System.out.println("Dastur allaqachon o'rnatilgan!");
                return false;
            }
        }

        // xotira yetarlimi ?
        if (storage >= app.getSize()) {
            installedApps.add(app);
            storage -= app.getSize();
            System.out.println(app.getName() + " dastur muvaffaqiyatli o'rnatildi!");
            return true;
        } else {
            System.out.println("Xotirada joy yetarli emas! dastur o'rnatilmadi.");
            return false;
        }
    }

    public void showApps() {
        System.out.println("Qurilmaga o'rnatilgan dasturlar: ");
        for (App installedApp : installedApps) {
            System.out.println(installedApp.getName());
        }
    }

    public boolean uninstall(String appName) {
        for (App installedApp : installedApps) {
            if (installedApp.getName().equals(appName)) {
                storage += installedApp.getSize();
                installedApps.remove(installedApp);
                System.out.println(appName + " dasturi muvaffaqiyatli o'chirildi!");
                return true;
            }
        }
        System.out.println(appName + " dasturi topilmadi! O'chirilmadi.");
        return false;
    }

    public void run(String appName) {
        for (App installedApp : installedApps) {
            if (installedApp.getName().equals(appName)) {
                runningApp = installedApp;
                System.out.println(appName + " dasturi ishga tushirildi!");
                return;
            }
        }

        System.out.println(appName + " dasturi topilmadi! Ishga tushirilmadi.");
    }

    public void info() {
        System.out.println("Ishga tushirilgan dastur: " + (runningApp != null ? runningApp.getName() : "Yo'q"));
        System.out.println("Qurilmaga o'rnatilgan dasturlar: ");
        for (App installedApp : installedApps) {
            System.out.println(installedApp.getName());
        }
        System.out.println("Joriy xotira: " + storage + " MB");
    }
}



