package kyu7;

import java.util.Arrays;
import java.util.stream.Collectors;

// https://www.codewars.com/kata/5390bac347d09b7da40006f6

public class JadenCase {
    public static void main(String[] args) {
        System.out.println(toJadenCase(""));
    }

    public static String toJadenCase(String phrase) {
        if(phrase == null || phrase.length() == 0 ) return null;
        return Arrays.stream(phrase.split(" "))
                .map(x -> x.substring(0, 1).toUpperCase()+x.substring(1))
                .collect(Collectors.joining(" "));

    }
}
