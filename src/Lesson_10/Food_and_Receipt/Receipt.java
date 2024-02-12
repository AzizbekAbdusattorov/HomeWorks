package Lesson_10.Food_and_Receipt;

public class Receipt {
    private int ingredientCount;
    private int maxIngredientCount;
    private Ingredient[] ingredients;

    public Receipt() {
        this.maxIngredientCount = 20;
        this.ingredients = new Ingredient[maxIngredientCount];
        this.ingredientCount = 0;
    }

    public boolean isFull() {
        return ingredientCount == maxIngredientCount;
    }

    public boolean isEmpty() {
        return ingredientCount == 0;
    }

    public void show() {
        for (int i = 0; i < ingredientCount; i++) {
            System.out.println("Ingredient #" + (i + 1) + ": Volume - " + ingredients[i].getVolume());
        }
    }

    public void addIngredient(Ingredient ingredient, int count) {
        for (int i = 0; i < count; i++) {
            if (ingredientCount < maxIngredientCount) {
                ingredients[ingredientCount++] = ingredient;
            } else {
                System.out.println("Receipt to'liq! Mahsulot qo'shilmadi.");
                return;
            }
        }
        System.out.println(count + " ta " + ingredient.getClass().getSimpleName() + " mahsuloti qo'shildi.");
    }

    public int getCount() {
        return ingredientCount;
    }
}
