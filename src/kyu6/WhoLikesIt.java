package kyu6;

//https://www.codewars.com/kata/5266876b8f4bf2da9b000362/

public class WhoLikesIt {
    public static void main(String[] args) {
        System.out.println(whoLikesIt("Max", "John", "Mark"));
    }

    public static String whoLikesIt(String... names) {
        String []array = names;
        switch (array.length) {
            case 0 : return "no one likes this";
            case 1 : return array[0] + " likes this";
            case 2 : return array[0] + " and " + array[1] + " like this";
            case 3 : return array[0] + ", " + array[1] + " and " + array[2] + " like this";
            default: return array[0] + ", " + array[1] + " and " + (array.length-2) + " others like this";
        }
    }
}

