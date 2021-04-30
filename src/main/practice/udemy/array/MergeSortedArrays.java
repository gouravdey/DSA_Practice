package main.practice.udemy.array;

import java.util.ArrayList;
import java.util.List;

// mergeSortedArrays([0,3,4,31], [4,6,30])
// output: [0,3,4,4,6,30,31]
public class MergeSortedArrays {
    public static void main(String[] args) {
        int firstArray[] = {0,3,4,31};
        int secondArray[] = {4,6,30};
        System.out.println(mergeSortedArrays(firstArray, secondArray));
    }

    public static List<Integer> mergeSortedArrays(int[] a, int[] b) {
        List<Integer> sortedList = new ArrayList<>();

        int i=0, j=0;
        while (i<a.length && j<b.length) {
            if (a[i] < b[j]) {
                sortedList.add(a[i]);
                i++;
            } else {
                sortedList.add(b[j]);
                j++;
            }
        }

        while (i<a.length) {
            sortedList.add(a[i]);
            i++;
        }

        while (j<b.length) {
            sortedList.add(b[j]);
            j++;
        }

        return sortedList;
    }
}
