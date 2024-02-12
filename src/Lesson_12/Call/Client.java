package Lesson_12.Call;

public class Client {
    private double balance;
    private boolean active;

    public Client(double initialBalance) {
        this.balance = initialBalance;
        this.active = false;
    }

    public void addSum(double amount) {
        balance += amount;
        active = true;
    }

    public boolean isActive() {
        return active;
    }

    public boolean call(int minutes) {
        double callCost = minutes * 0.1; // assuming call cost is 0.1 per minute
        if (balance >= callCost) {
            balance -= callCost;
            active = true;
            return true;
        }
        return false;
    }

    public boolean sms(int count) {
        double smsCost = count * 0.05; // assuming SMS cost is 0.05 per SMS
        if (balance >= smsCost) {
            balance -= smsCost;
            active = true;
            return true;
        }
        return false;
    }
}
