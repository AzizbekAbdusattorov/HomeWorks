package Lesson_8.Basket;

import java.util.Arrays;


public class Basket {
    private Capacity capacity;
    private Fruit fruit;
    private Fruit[] fruits;
    private Fruit[] a = new Fruit[10];
    private static int[] b = new int[10];

    public Basket(Capacity capacity, Fruit fruit) {
        this.capacity = capacity;
        this.fruit = fruit;
        this.fruits = new Fruit[]{fruit};
        showInfo();
    }

    public Basket(Capacity capacity) {
        this.capacity = capacity;
        this.fruits = new Fruit[]{};
    }

    public boolean isFull() {
        int sumWeight = 0;
        for (Fruit value : fruits) {
            sumWeight += value.getWeight();
        }
        return sumWeight == capacity.getBasketCapacity();
    }

    public boolean isEmpty() {
        return this.fruits.length == 0;
    }

    public void addFruit(Fruit fruit) {
        if (!isFull()) {
            Fruit[] arrayF = new Fruit[this.fruits.length + 1];
            int lastI = this.fruits.length;
            for (int i = 0; i < fruits.length; i++) {
                arrayF[i] = fruits[i];
            }

            arrayF[lastI] = fruit;
            this.fruits = arrayF;

            showInfo();
        } else {
            //show error
        }
    }

    public void addFruits(Fruit[] aFruits) {
        if (!isFull()) {
            Fruit[] arrayF = new Fruit[this.fruits.length + aFruits.length];
            int index = 0;
            for (int i = 0; i < fruits.length; i++) {
                arrayF[index++] = fruits[i];
            }
            for (int i = 0; i < aFruits.length; i++) {
                arrayF[index++] = aFruits[i];
            }
            this.fruits = arrayF;
            showInfo();
        } else {
            //show error
        }
    }

    public void showInfo() {
        System.out.println(Arrays.toString(fruits));
    }

}
