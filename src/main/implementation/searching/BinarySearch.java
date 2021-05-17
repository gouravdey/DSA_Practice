package main.implementation.searching;

public class BinarySearch {
    public static void main(String[] args) {
        int array[] = {0, 1, 2, 4, 5, 6, 44, 63, 87, 99, 283 };
        int value = 283;
        int low = 0, high = array.length;
        while (low < high) {
            int mid = (low + high)/2;
            if (array[mid] == value) {
                System.out.println(mid);
                return;
            } else if (array[mid] < value) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
    }
}
