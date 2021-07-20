package kyu4;

import java.util.ArrayList;
import java.util.List;

// https://www.codewars.com/kata/521c2db8ddc89b9b7a0000c1

public class Snail {
    public static void main(String[] args) {

//        snail(new int[][]{  {1, 2, 3, 4},
//                            {5, 6, 7, 8,},
//                            {9, 10, 11, 12},
//                            {13, 14, 15, 16}});

    }
    public static int[] snail(int[][] array) {

        if(array[0].length == 0) return new int[0];

        List<Integer> temptList = new ArrayList<Integer>();
        for (int i = 0; i < array.length; i++) {

            for (int j = i; j < array.length-i; j++) {      // right
                temptList.add(array[i][j]);

            }
            for (int j = i+1; j < array.length-1-i; j++) {  // down
                temptList.add(array[j][array.length-1-i]);

            }
            for (int j = array.length-1-i; j >= i ; j--) {  // left
                temptList.add(array[array.length-1-i][j]);

            }

            for (int j = array.length-2-i; j > i; j--) {    // up
                temptList.add(array[j][i]);

            }
        }
        if(array.length%2!=0) temptList.remove(temptList.size()-1);
        return temptList.stream().mapToInt(x-> x).toArray();
    }
}
