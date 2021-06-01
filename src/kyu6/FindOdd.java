package kyu6;

// https://www.codewars.com/kata/54da5a58ea159efa38000836

public class FindOdd {
    public static void main(String[] args) {
        System.out.println(findIt(new int[]{20,1,-1,2,-2,3,3,5,5,1,2,4,20,4,-1,-2,5}));
    }

    public static int findIt(int[] a) {
        for (int x : a) {
            int odd = 0;
            for (int y : a ) {
                if(x == y) odd++;
            }
            if (odd%2!=0)  return x;
        }
        return 0;
    }
}
