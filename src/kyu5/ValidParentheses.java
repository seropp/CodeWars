package kyu5;

import java.util.*;

public class ValidParentheses {
    public static void main(String[] args) {
        System.out.println(validParentheses("):_3G()))rE);)m)((fRS]B"));
    }

    public static boolean validParentheses(String parens) {
        parens = parens.replaceAll("[^()]","");

        List<String> list = new ArrayList<>(parens.length());
        for (String x : parens.split("")) list.add(x);
        for (int i = 0; i < list.size()-1; i++) {
            if("()".contains(list.get(i)+list.get(i+1))){
                list.remove(i+1);
                list.remove(i);
                i= -1;
            }
        }
        if (list.size()==0 || list.get(0).equals("")) return true;
        return false;
    }
}
