package kyu6;

// https://www.codewars.com/kata/54bf1c2cd5b56cc47f0007a1/train/java

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CountingDuplicates {

    public static void main(String[] args) {
        System.out.println(duplicateCount("abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZReturnsTwentySix"));
    }

    public static int duplicateCount(String text) {
        char[] arr = text.toCharArray();
        return (int) text.chars().filter(c -> {
            int count =0;
            for (int i = 0; i < arr.length; i++) {
                if(Character.toLowerCase(c) == Character.toLowerCase(arr[i])) {
                    count++;
                    arr[i] = "\n".charAt(0);
                }
            }
            if (count>1) return true;
            return false;
        }).count();
    }
}
