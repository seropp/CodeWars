package kyu5;

// https://www.codewars.com/kata/555624b601231dc7a400017a/train/java

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class JosephusSurvivor {
    public static void main(String[] args) {
        System.out.println((4)%7);
    }
    public static int josephusSurvivor(final int n, final int k) {
        List<Integer> linkedList = new LinkedList<>();
        for (int i = 1; i <= n; i++) {
            linkedList.add(i);
        }
        int count = 1, index = 0;
        while (linkedList.size()>1){
            if(count==k){
                linkedList.remove(index);
                index--;
                count=0;
            }
            else {
                count++;
                index++;
                if(index==linkedList.size()){
                    index=0;
                }
            }
        }
        System.out.println(linkedList);
        return linkedList.get(0);
    }
    public static <T> List<T> josephusPermutation(final List<T> items, final int k) {
        List<T> linkedList = new LinkedList<T>();
        linkedList.addAll(items);
        ArrayList<T> arrayList = new ArrayList<>();

        int count = 1, index = 0;
        while (linkedList.size()>0){
            if(count==k){
                arrayList.add(linkedList.get(index));
                linkedList.remove(index);
                index--;
                count=0;
            }
            else {
                count++;
                index++;
                if(index==linkedList.size()){
                    index=0;
                }
            }
        }
        System.out.println(linkedList);
        return arrayList;
    }
    public static <T> List<T> josephusPermutation2(final List<T> items, final int k) {

        ArrayList<T> arrayList = new ArrayList<>();
        int pos = 0;
        while (items.size()>0){
            pos = (pos+k-1)%items.size();
            arrayList.add(items.remove(((int)pos)));
        }
        return arrayList;
    }
}
