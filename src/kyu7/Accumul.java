package kyu7;

//www.codewars.com/kata/5667e8f4e3f572a8f2000039

public class Accumul {
    public static void main(String[] args) {
        System.out.println(accum("dfErf" ));
    }

    public static String accum(String s) {
        String accum = "";
        for (int i = 0; i < s.length() ; i++) {
            accum += s.toUpperCase().toCharArray()[i];
            for (int j = 0; j < i; j++) {
                accum += s.toLowerCase().toCharArray()[i];
            }
            if(i+1 != s.length())accum +="-";
        }
        return accum;
    }
}