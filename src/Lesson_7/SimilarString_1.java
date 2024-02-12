package Lesson_7;

public class SimilarString_1 {
    char[] chars;

    public SimilarString_1(char[] chars){
        this.chars = chars;
    }

    public SimilarString_1(String s){
        this.chars = s.toCharArray();
    }

    boolean equals(char[] mass){
        if (chars.length != mass.length){
            return false;
        }

        for (int i = 0; i < mass.length; i++) {
            if (chars[i] != mass[i]){
                return false;
            }
        }

        return true;

    }

    boolean equals(char[] mass, boolean ignoreCase){
        if (ignoreCase){
            if (mass.length != chars.length){
                return false;
            }

            for (int i = 0; i < chars.length; i++) {
                if (Character.toLowerCase(chars[i]) != Character.toLowerCase(mass[i])){
                    return false;
                }
            }

        }

        return true;
    }

    char[] subString(int startIndex){
        char[] arr = new char[chars.length - startIndex];
        int k = 0;
        for (int i = startIndex; i < chars.length; i++) {
            arr[k] = chars[i];
            k++;
        }

        return arr;
    }

    char[] subString(int startIndex, int endIndex){
        char[] arr = new char[endIndex - startIndex];
        int k = 0;
        for (int i = startIndex; i < endIndex; i++) {
            arr[k] = chars[i];
            k++;
        }

        return arr;
    }

}

