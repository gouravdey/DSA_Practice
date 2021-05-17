package main.implementation.searching;

public class LinearSearch {
    public static void main(String[] args) {
        int array[] = {99, 44, 6, 2, 1, 5, 63, 87, 283, 4, 0};
        int value = 87;
        for (int i = 0; i< array.length; i++) {
            if (array[i] == value) {
                System.out.println(i);
            }
        }
    }
}
