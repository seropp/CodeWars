package kyu5;

import java.util.*;
import java.util.stream.Collectors;

public class Scramble {
    public static void main(String[] args) {
        System.out.println(scramble("", "jf3jf"));
    }

    public static boolean scramble(String str1, String str2) {
       List<String> l1 = new ArrayList<String>(Arrays.asList(str1.split("")));
       List<String> l2 = new ArrayList<String>(Arrays.asList(str2.split("")));
       l1.retainAll(l2);
        for (String x: l2) {
            if(Collections.frequency(l2,x) > Collections.frequency(l1,x)){
                return false;
            }
        }
       return true;
    }
}
