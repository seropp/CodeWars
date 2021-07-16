package kyu6;

import java.util.stream.Stream;

public class Persist {
    public static void main(String[] args) {
        System.out.println(persistence(3));
    }

    public static int persistence(long n) {

        if((n+"").length()==1) return 0;

        int count = 0;
        while ((n+"").length()!=1) {
            int x = Stream.of((n + "").split(""))
                    .map(Integer::parseInt)
                    .reduce((z, y) -> z * y).get();
            n = x;
            count++;
        }

        return count;
    }
}
