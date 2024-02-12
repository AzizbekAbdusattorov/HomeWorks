package Lesson_10.Food_and_Receipt;

public class Food {
    private Receipt receipt;

    public Food(Receipt receipt) {
        this.receipt = receipt;
    }

    public void add(Ingredient ingredient) {
        if (!receipt.isFull()) {
            receipt.addIngredient(ingredient, 1);
            System.out.println(ingredient.getClass().getSimpleName() + " mahsuloti qo'shildi.");
        } else {
            System.out.println("Food tayyorlash mumkin emas! Receipt to'liq.");
        }
    }

    public Receipt getReceipt() {
        return receipt;
    }

    public boolean hasFood() {
        return !receipt.isEmpty();
    }
}
