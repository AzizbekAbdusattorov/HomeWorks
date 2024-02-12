package Lesson_7;

public class Main_SimilarString {
    public static void main(String[] args) {
        char [] chars = {'H', 'e', 'l', 'l', 'o'};
        SimilarString s1 = new SimilarString(chars);

        char [] chars1 = {'H', 'e', 'l', 'l', 'o'};
        System.out.println(s1.equals(chars1));

        char [] mass = {'h', 'e', 'l', 'l', 'o'};
        System.out.println(s1.equals(mass, true));

        char [] arr = s1.subString(2);
        for (char ch : arr){
            System.out.print(ch + " ");
        }
        System.out.println();

        System.out.println(s1.subString(0, 4));

//        char [] chars2 = {'H', 'e', 'l', 'l', 'o'};
//        ChildSimilarString ch1 = new ChildSimilarString(chars);


    }
}
