package Lesson_7;

public class SimilarString {
    char [] chars;


    public SimilarString(char [] chars){
        // constructor
        this.chars = chars;
//        for (char chars1 : chars) {
//            System.out.print(chars1);
//        }
    }

    public SimilarString(String s){
        // constructor
        this.chars = s.toCharArray();

//        for (char chars2 : chars) {
//            System.out.print(chars2);
//        }
    }

    boolean equals(char [] mass) {
        // tenglik tog'rilikga tekshirish bunda 'A' != 'a' ga
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

    boolean equals(char [] mass, boolean ignoreCase) {
        // tenglik togrilikka tekshirish bunda 'A' == 'a' ga
        // yani katta harflar kichik harflarga teng boladi.
        if (ignoreCase) {
            if (chars.length != mass.length) {
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

    char [] subString(int startIndex){
        // startIndexdan boshlab oxirigacha bolgan qismidan yangi massiv
        // yaratib qaytaring
        int k = 0;
        for (int i = startIndex; i < chars.length; i++) {
            k++;
        }
        char [] arr = new char[k];
        int l = 0;
        for (int i = startIndex; i < chars.length; i++) {
            arr[l] = chars[i];
            l++;
        }


        return arr;

    }

    char[] subString(int startIndex, int endIndex){
        // startIndexdan boshlab endIndexgacha bolgan qismidan yangi massiv
        // yaratib qaytaring
        int k = 0;
        for (int i = startIndex; i < endIndex; i++) {
            k++;
        }

        char[] arr =  new char[k];
        int l = 0;
        for (int i = startIndex; i < endIndex; i++) {
            arr[l] = chars[i];
            l++;
        }


        return arr;
    }

}
