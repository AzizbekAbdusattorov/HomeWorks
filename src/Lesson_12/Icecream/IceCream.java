package Lesson_12.Icecream;

public class IceCream {
    private Recipe recipe;
    private Piece piece;
    private Milk milk;
    private Sugar sugar;
    private int soldCount;
    private int balance;

    public IceCream(Recipe recipe, Piece piece) {
        this.recipe = recipe;
        this.piece = piece;
        this.soldCount = 0;
        this.balance = 0;
    }

    public void addMilk(Milk milk) {
        this.milk = milk;
    }

    public void addSugar(Sugar sugar) {
        this.sugar = sugar;
    }

    public int getCount() {
        double milkWeight = milk != null ? milk.getCost() : 0;
        double sugarWeight = sugar != null ? sugar.getCost() : 0;
        int count = (int) (Math.min(milkWeight, sugarWeight) / piece.getCost() / recipe.getMilkToSugarRatio());
        System.out.println("Count of available ice creams: " + count);
        return count;
    }

    public boolean buy(int quantity) {
        int availableCount = getCount();
        if (availableCount >= quantity) {
            soldCount += quantity;
            balance += quantity * piece.getCost();
            System.out.println("Ice creams bought successfully.");
            return true;
        } else {
            System.out.println("Not enough ice creams available.");
            return false;
        }
    }

    public int getBalance() {
        System.out.println("Current balance: $" + balance);
        return balance;
    }

    public boolean hasIceCream() {
        return getCount() > 0;
    }

    public void getInfo() {
        System.out.println("Sold ice creams: " + soldCount + " x $" + piece.getCost() + " = $" + soldCount * piece.getCost());
    }

    public void getProfit() {
        System.out.println("Total profit: $" + balance);
    }
}
