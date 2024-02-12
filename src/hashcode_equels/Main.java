package hashcode_equels;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {

        Set<String> s1 = new LinkedHashSet<>();
       s1.add("A");
       s1.add("A1");
       s1.add("A2");
       s1.add("A3");
       s1.add("A4");

       for (String s : s1){
           System.out.println(s);
       }

    }
}
