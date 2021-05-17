package main.implementation.sorting;

public class QuickSort {
    public static void main(String[] args) {
        int array[] = {99, 44, 6, 2, 1, 5, 63, 87, 283, 4, 0};

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();

        quickSort(array, 0, array.length-1);

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }

    public static void quickSort(int a[], int begin, int end) {
        if (begin < end) {
            int partitionIndex = partition(a, begin, end);

            quickSort(a, begin, partitionIndex-1);
            quickSort(a, partitionIndex+1, end);
        }
    }

    public static int partition(int a[], int begin, int end) {
        int pivot = a[end];
        int i = begin - 1;

        for (int j = begin; j < end; j++) {
            if (a[j] <= pivot) {
                i++;

                int temp = a[i];
                a[i] = a[j];
                a[j] = temp;
            }
        }

        int temp = a[i+1];
        a[i+1] = a[end];
        a[end] = temp;

        return i+1;
    }
}
