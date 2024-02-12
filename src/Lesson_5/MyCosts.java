package Lesson_5;

public class MyCosts {      // mening xarajatlarim

    String username;        // foydalanuvchi nomi
    int money;              // pul


    void showInfo() {    // malumotni ko'rsatish
        System.out.println("Username: " + username + "\n" + "Money: " + money + "$");
    }

    int getNowMoney() {  // hozir pul oling
        return money;
    }

    void spendMoney(int spend) {     // pul sarflash
        money -= spend;
        System.out.println("---- ---- ---- ----");
        showInfo();
    }

    void addMoney(int addSum) {      // pul qo'shing
        money += addSum;
        System.out.println("---- ---- ---- ----");
        showInfo();
    }
}