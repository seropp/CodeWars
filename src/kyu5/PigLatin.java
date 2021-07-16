package kyu5;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class PigLatin {
    public static void main(String[] args) {
        System.out.println(pigIt("pig !"));
    }

    public static String pigIt(String str) {
        if(str.length()==0) return "";
        String temp[] = str.split(" ");
        return Stream.of(temp)
                .map(x -> {
                    if(x.equals("!") || x.equals("?")){ return x;}
                    return   x.substring(1)+x.charAt(0)+"ay";
                })
                .collect(Collectors.joining(" "));
    }
}
