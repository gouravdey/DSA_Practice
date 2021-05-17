package main.implementation.sorting;

public class SelectionSort {
    public static void main(String[] args) {
        int array[] = {99, 44, 6, 2, 1, 5, 63, 87, 283, 4, 0};

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();

        for (int i = 0; i < array.length; i++) {
            int smallestIndex = i;
            for (int j = i+1; j < array.length; j++) {
                if (array[j] < array[smallestIndex]) {
                    smallestIndex = j;
                }
            }
            int temp = array[i];
            array[i] = array[smallestIndex];
            array[smallestIndex] = temp;
        }

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
