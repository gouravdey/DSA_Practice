package main.implementation.sorting;

public class MergeSort {
    public static void main(String[] args) {
        int array[] = {99, 44, 6, 2, 1, 5, 63, 87, 283, 4, 0};

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();

        mergeSort(array);

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }

    public static void mergeSort(int a[]) {
        if (a.length < 2) {
            return;
        }
        int mid = a.length/2;
        int[] left = new int[mid];
        int[] right = new int[a.length-mid];

        for (int i = 0; i < mid; i++) {
            left[i] = a[i];
        }

        for (int i = 0; i < a.length - mid; i++) {
            right[i] = a[mid+i];
        }

        mergeSort(left);
        mergeSort(right);

        merge(a, left, right);
    }

    public static void merge(int[] a, int[] l, int[] r) {
        int i = 0, j = 0, k  = 0;

        while (i<l.length && j<r.length) {
            if (l[i] < r[j]) {
                a[k] = l[i];
                k++;
                i++;
            } else {
                a[k] = r[j];
                k++;
                j++;
            }
        }

        while (i<l.length) {
            a[k] = l[i];
            k++;
            i++;
        }

        while (j<r.length) {
            a[k] = r[j];
            k++;
            j++;
        }
    }
}
