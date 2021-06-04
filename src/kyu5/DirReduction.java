package kyu5;

//https://www.codewars.com/kata/550f22f4d758534c1100025a


import java.util.*;

public class DirReduction {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(dirReduc(new String[]
                {"NORTH", "SOUTH", "SOUTH", "EAST", "WEST", "NORTH", "WEST"})));
    }
    public static String[] dirReduc(String[] arr) {
       List<String> list = new ArrayList<>(Arrays.asList(arr));

       for (int i = 0; i < list.size() - 1; i++) {
           if ("NORTH:SOUTH,EAST:WEST,SOUTH:NORTH,WEST:EAST".contains(list.get(i) + ":" + list.get(i + 1))) {
               list.remove(i+1);
               list.remove(i);
               i=-1;
           }
       }
        return list.toArray(new String[list.size()]);
    }
}
