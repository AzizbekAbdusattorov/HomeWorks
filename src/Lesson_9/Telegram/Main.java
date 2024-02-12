package Lesson_9.Telegram;

public class Main {
    public static void main(String[] args) {
        Telegram telegram = new Telegram();

        User user1 = new User("Abdusattorov", "Azizbek", 20, "+998917350230");
        User user2 = new User("Sotvoldiev", "Usmonali", 48, "+998905660829");


        boolean created1 = telegram.createAccount(user1);
        boolean created2 = telegram.createAccount(user2);

        //  sms kodni tekshirish va accountni yaratish
        if (created1) {
            telegram.checkSMSCode(1234, user1.getPhoneNumber());
        }

        if (created2) {
            telegram.checkSMSCode(5678, user2.getPhoneNumber());
        }

        // Accountlar sonini chiqarish
        System.out.println("Accountlar soni: " + telegram.getUserCount());

        // Accountni o'chirish
        boolean deleted = telegram.deleteAccount(user1.getPhoneNumber());

        if (deleted) {
            System.out.println("Account o'chirildi!");
        } else {
            System.out.println("Account topilmadi!");
        }

        // Qaytadan accountlar sonini chiqarish
        System.out.println("Accountlar soni: " + telegram.getUserCount());
    }
}
