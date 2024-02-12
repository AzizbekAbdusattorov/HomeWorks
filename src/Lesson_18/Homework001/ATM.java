package Lesson_18.Homework001;

import java.util.ArrayList;

public class ATM {

    private ArrayList<Money> moneyList = new ArrayList<>();
    private MessageInterface messageListener;
    private ShowMoneyInfoInterface moneyListener;


    public void addMoneys(ArrayList<Money> moneys) {
        moneyList.addAll(moneys);
    }

    public void setMessageListener(MessageInterface messageListener) {
        this.messageListener = messageListener;
    }

    public void setShowMoneyInfoInterface(ShowMoneyInfoInterface moneyListener) {
        this.moneyListener = moneyListener;
    }

    public void isGetMoney(int getSum) {
        ArrayList<Money> withdrawnMoney = new ArrayList<>();

        for (Money money : moneyList) {

            if (money.getAmount() <= getSum) {
                getSum -= money.getAmount();
                withdrawnMoney.add(money);
            }

            if (getSum == 0) {
                break;
            }
        }

        if (getSum == 0) {
            moneyList.removeAll(withdrawnMoney);
            messageListener.showMessage("Muvaffaqiyatli pul yechildi: ");
        } else {
            messageListener.showMessage("Error: pul yechilmadi: ");
        }
    }

    public void moneysInfo() {
        for (Money money : moneyList) {
            int count = 0;

            for (Money m : moneyList) {
                if (m.getAmount() == money.getAmount()) {
                    count++;
                }
            }

            moneyListener.showMoneyData(money.getAmount(), count);
        }
    }

    public int getBalance() {
        int balance = 0;
        for (Money money : moneyList) {
            balance += money.getAmount();
        }
        return balance;
    }

}
