package kyu7;

//www.codewars.com/kata/52fba66badcd10859f00097e

public class Troll {
    public static void main(String[] args) {
        System.out.println(disemvowel("This website is for losers LOL!"));
    }

    public static String disemvowel(String str) {
        return str.replaceAll("[AaEeOoUuIi]", "");
    }
}
