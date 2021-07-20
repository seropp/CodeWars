package kyu5;

import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.Collectors;

// https://www.codewars.com/kata/55c6126177c9441a570000cc

public class WeightSort {
    public static void main(String[] args) {
        System.out.println(orderWeight("2000 10003 1234000 44444444 9999 11 11 22 123"));
    }
    public static String orderWeight(String string) {
        return   Arrays.stream(string.split(" "))
                .sorted(Comparator
                        .comparing(WeightSort::sumNumb)
                        .thenComparing(String::compareTo))
                .collect(Collectors.joining(" "));


    }
    private static int sumNumb (String number) {
        return Arrays.stream(number.split(""))
                .mapToInt(Integer::parseInt)
                .sum();
    }
}
