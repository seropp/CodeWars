package src.kyu6;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ConvertToCamelCase {
    public static void main(String[] args) {
        System.out.println(toCamelCase2("the_stealth_warrior"));
    }
    static String toCamelCase(String s){
        if(s.length()==0) return "";
        char[] chars = s.toCharArray();
        StringBuilder a = new StringBuilder();
        for (int i = 0; i < chars.length; i++) {
            if(chars[i] == '-' || chars[i] == '_'){
                a.append(Character.toUpperCase(chars[i+1]));
                i++;
                continue;
            }
            a.append(chars[i]);
        }
        return a.toString();
    }
    static String toCamelCase2(String s){
        Matcher matcher = Pattern.compile("[_|-](\\w)").matcher(s);
        StringBuilder builder = new StringBuilder();
        while (matcher.find()) {
            matcher.appendReplacement(builder, matcher.group(1).toUpperCase());
        }
        return matcher.appendTail(builder).toString();
    }
}
