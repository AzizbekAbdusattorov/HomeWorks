package Lesson_25.homework1;

public class Main {
    public static void main(String[] args) {

        MyArrayList<String> m1 = new MyArrayList<>();
        m1.add("1");
        m1.add("2");
        m1.add("3");
        m1.add("4");
        m1.add("5");
        m1.add("6");
        m1.add("7");
        m1.add("8");
        m1.add("9");
        m1.add("10");
//        m1.add(3); // 11 - element (capacity formula asosida oshadi)


        System.out.println(m1);
        System.out.println(m1.size()); // elementlar soni -> 10
        System.out.println(m1.length()); // capacity -> 10

        System.out.println();

//        System.out.println(m1.indexOf("10"));


//        System.out.println(m1.set(0, "50"));

//        System.out.println(m1.get(2));

//        m1.add(1, "11");
        /**
         * berilgan indeksga elementni qo'shadi
         */

//        System.out.println(m1.isEmpty());
        /**
         * list bosh bosa true, aks holda false
         */

//        m1.clear();
        /**
         * listdagi barcha elementlarni o'chiradi
         * clear() -> metodi list bom bosh qiladi.
         */

//        System.out.println(m1.contains("8"));
        /**
         * metodga berilgan element list da bosa true, aks holda false
         */


//        System.out.println(m1.remove(2));
        /**
         * berilgan index list indexdagi elementni o'chiradi
         */

//        System.out.println(m1.remove("1"));
        /**
         * ishladi faqat int tipida kirsa (remove(int index) ishlab ketadi)
         */

//        MyArrayList<String> m2 = new MyArrayList<>();
//        m2.add("1");
//        m2.add("11");
//        m2.add("12");
//        m2.add("13");
//
//        System.out.println(m2);
//        System.out.println(m2.size());
//        System.out.println(m2.length());
//
//        System.out.println(m1.addAll(m2)); // 2 ta listni qo'shadi
        /**
         * ishladi ammo int tipli va String tipli va boshqa tipli
         * 2 xil listni ham qo'shmoqda
         */

//        System.out.println(m1.removeAll(m2));
        /**
         * m1 va m2 list da bor bogan bir xil elementlar
         * m1 listdan ochiriladi.
         */

//        System.out.println(m1);
//        System.out.println(m2);
    }
}
