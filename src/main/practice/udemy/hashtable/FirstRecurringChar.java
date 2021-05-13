package main.practice.udemy.hashtable;

// Given an array, find the first recurring character.
// Input: [2,5,1,2,3,5,1,2,4]
// Output: 2

import java.util.*;

public class FirstRecurringChar {
    public static void main(String[] args) {
        List<Integer> integerList1 = new ArrayList<>(Arrays.asList(2,5,1,2,3,5,1,2,4));
        List<Integer> integerList2 = new ArrayList<>(Arrays.asList(2,1,1,2,3,5,1,2,4));
        List<Integer> integerList3 = new ArrayList<>(Arrays.asList(2,3,4,5));

        System.out.println(firstRecurringChar(integerList1));
        System.out.println(firstRecurringChar(integerList2));
        System.out.println(firstRecurringChar(integerList3));
    }

    public static int firstRecurringChar(List<Integer> list) {
        Set<Integer> chars = new HashSet<>();
        for (int l:list) {
            if (chars.contains(l)) {
                return l;
            } else {
                chars.add(l);
            }
        }
        return -1;
    }
}
