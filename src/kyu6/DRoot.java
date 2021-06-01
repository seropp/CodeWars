package kyu6;

//www.codewars.com/kata/541c8630095125aba6000c00

public class DRoot {
    public static void main(String[] args) {
        System.out.println(digital_root(132189));
    }

    public static int digital_root(int n) {
        while (n > 9) {
            n = n/10 + n%10;
        }
        return n;
    }
}


