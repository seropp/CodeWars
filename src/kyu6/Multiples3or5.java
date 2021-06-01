package kyu6;

//www.codewars.com/kata/514b92a657cdc65150000006

public class Multiples3or5 {
    public static void main(String[] args) {
        System.out.println(solution(10));
    }

    public static int solution(int number) {
        if (number < 0) return 0;
        int result = 0;
        for (int i = 1; i < number; i++) {
            if ((i%3 == 0) || (i%5 == 0)) result +=i;
        }
        return result;
    }
}
