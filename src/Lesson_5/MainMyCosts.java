package Lesson_7.Lesson_5;

public class MainMyCosts {
    public static void main(String[] args) {
        MyCosts m1 = new MyCosts();
        m1.username = "Azizbek";
        m1.money = 5000;
        m1.showInfo();

        System.out.println("---- ---- ---- ----");
        System.out.println("Get now money: " + m1.getNowMoney() + "$");

        m1.spendMoney(4000);

        m1.addMoney(2000);
    }
}