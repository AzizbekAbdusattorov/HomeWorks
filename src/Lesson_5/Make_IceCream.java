package Lesson_7.Lesson_5;

public class Make_IceCream {
    int milk;
    int sugar;

    void addMilk(int a) {
        milk = a;
        System.out.println("Milk: " + milk + "litr");
    }

    void addSugar(int b) {
        sugar = b;
        System.out.println("Sugar: " + sugar + "kg");
    }

    int maxIceCreamCount(int a, int b){
        int k = milk;
        int l = sugar;

        int count = 0;
        while (k > 0 && l > 0){
            k -= a;
            l -= b;
            count++;
        }
        return count;
    }

    void showInfo(){
        System.out.println("New milk: " + milk + "litr");
        System.out.println("New sugar: " + sugar + "kg");
    }

    void makeIceCream(int a, int b, int count){
        int count1 = 0;
        while (milk > 0 && sugar > 0){
            milk -= a;
            sugar -= b;
            count1++;
        }

        if (count1 == count){
            showInfo();
            System.out.println("---- ---- ---- ----");
            System.out.println("Count da tayyorlash mumkin: " + count1 + "ta");
        } else {
            System.out.println("---- ---- ---- ----");
            System.out.println("Count da tayyorlash mumkin emas: ");
        }
    }
}
