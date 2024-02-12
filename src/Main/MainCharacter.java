package Main;

public class MainCharacter {
    public static void main(String[] args) {
        char ch = '5';
        boolean isLetter = Character.isLetter(ch);
//        System.out.println(isLetter);

        char x = 'B';
        char y = 'A';
        int result = Character.compare(x, y);
        System.out.println(result);
    }
}
