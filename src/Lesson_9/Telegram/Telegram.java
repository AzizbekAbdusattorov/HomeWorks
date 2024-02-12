package Lesson_9.Telegram;

import java.util.HashMap;
import java.util.Map;

public class Telegram {
    private Map<String, User> userMap;      // phoneNumber --> User
    private Map<String, Integer> smsCodeMap;    // phoneNumber -- sms Code

    public Telegram() {
        this.userMap = new HashMap<>();
        this.smsCodeMap = new HashMap<>();
    }

    public boolean createAccount(User user) {
        String phoneNumber = user.getPhoneNumber();

        if (!userMap.containsKey(phoneNumber)) {
            // profil mavjud emas, sms yuborish
            int smsCode = generateSMSCode();
            sendSMS(phoneNumber, smsCode);
            smsCodeMap.put(phoneNumber, smsCode);

            return true;
        } else {
            // profil mavjud
            return false;
        }
    }

    public void checkSMSCode(int code, String phoneNumber) {
        if (smsCodeMap.containsKey(phoneNumber) && smsCodeMap.get(phoneNumber) == code) {
            // sms tog'ri account yaratish
            User user = new User("DefaultLastName", "DefaultFirstName", 18, phoneNumber);
            userMap.put(phoneNumber, user);
            System.out.println("Account yaratildi!");
        } else {
            // sms notog'ri
            System.out.println("Xatolik: Noto'g'ri sms cade!");
        }
    }

    public int getUserCount() {
        return userMap.size();
    }

    public boolean deleteAccount(String phoneNumber) {
        if (userMap.containsKey(phoneNumber)) {
            // Accountni o'chirish
            userMap.remove(phoneNumber);
            return true;
        } else {
            // Account topilmadi
            return false;
        }
    }

    private int generateSMSCode() {
        return (int) (Math.random() * 9000) + 1000; // 4 xonali tasodifiy raqam
    }

    private void sendSMS(String phoneNumber, int code) {
        System.out.println("SMS yuborildi! Telefon raqami: " + phoneNumber + ", SMS code: " + code);
    }

}
