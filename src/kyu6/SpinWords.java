package kyu6;

//https://www.codewars.com/kata/5264d2b162488dc400000001

public class SpinWords {
    public static void main(String[] args) {
        System.out.println(spinWords("Hey fellow warriors"));
    }


    public static String spinWords(String sentence) {
        StringBuffer word;

        String []array = sentence.split(" ");
        for (int i = 0; i < array.length; i++) {
            if (array[i].length() > 4) {
                word = new StringBuffer(array[i]);
                word.reverse();
                array[i] = word.toString();
            }
        }
        return String.join(" ", array);
    }
}
