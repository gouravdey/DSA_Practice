package main.implementation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* ========================================
Worst Case Time Complexity
Access O(1)
Search O(n)
Insertion O(n)
Deletion O(n)
 ======================================== */


public class Array {
    public static void main(String[] args) {
        List<Integer> arrayList = new ArrayList<>(Arrays.asList(1,2,3,4,5,6));

        System.out.println(arrayList.get(1));   //Accessing 1st element [O(1)]
        arrayList.set(0,3); //Setting 2nd element [O(1)]
        System.out.println(arrayList.size());   //Getting the size of the array [O(1)]
        arrayList.add(3);   //Appending to the end of the list [O(1)]
        arrayList.add(3,4); //Adding element in a specific index

        System.out.println(arrayList);
    }
}
