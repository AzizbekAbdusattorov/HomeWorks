package random;

import java.util.Random;

public class Main1 {

    public static void main(String[] args) {

        Random random = new Random();

        int x = random.nextInt(1000, 9999);

        System.out.println(x);

    }

}
