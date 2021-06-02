package kyu5;

//https://www.codewars.com/kata/550f22f4d758534c1100025a

import java.util.*;

public class DirReduction {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(dirReduc(new String[]{"NORTH", "EAST", "SOUTH", "WEST", "SOUTH", "SOUTH", "NORTH", "WEST"})));
    }
    public static String[] dirReduc(String[] arr) {
        List<String> list = new LinkedList<>(Arrays.asList(arr));

        int n =  Collections.frequency(list, "NORTH");
        int s =  Collections.frequency(list, "SOUTH");
        int w =  Collections.frequency(list, "WEST");
        int e =  Collections.frequency(list, "EAST");
        if (n >= s) {
            for (int i = 0; i < s; i++) {
                list.remove("NORTH");
                list.remove("SOUTH");
            }
        }
        else {
            for (int i = 0; i < n; i++) {
                list.remove("SOUTH");
                list.remove("NORTH");
            }
        }
        if (w >= e) {
            for (int i = 0; i < e; i++) {
                list.remove("WEST");
                list.remove("EAST");
            }
        }
        else {
            for (int i = 0; i < w; i++) {
                list.remove("EAST");
                list.remove("WEST");
            }
        }
        return list.toArray(new String[list.size()]);
    }
}
