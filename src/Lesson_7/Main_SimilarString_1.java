package Lesson_7;

public class Main_SimilarString_1 {
    public static void main(String[] args) {
        char[] chars = {'H', 'e', 'l', 'l', 'o'};
        SimilarString_1 s1 = new SimilarString_1(chars);

        char[] chars1 = {'H', 'e', 'l', 'l', 'o'};
        System.out.println(s1.equals(chars1));

        char[] chars2 = {'h', 'e', 'l', 'l', 'o'};
        System.out.println(s1.equals(chars2, true));

        System.out.println(s1.subString(2));

        System.out.println(s1.subString(1, 4));
    }
}
