package main.practice.interviewbit.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//Given a matrix of m * n elements (m rows, n columns), return all elements of the matrix in spiral order.

public class SpiralMatrix {

    public static void main(String[] args) {
        List<ArrayList<Integer>> arrayListList = new ArrayList<>();
        arrayListList.add(new ArrayList<>(Arrays.asList(1,2,3)));
        arrayListList.add(new ArrayList<>(Arrays.asList(4,5,6)));
        arrayListList.add(new ArrayList<>(Arrays.asList(7,8,9)));

        System.out.println(spiralOrder(arrayListList));
    }

    public static ArrayList<Integer> spiralOrder(final List<ArrayList<Integer>> A) {
        ArrayList<Integer> integerList = new ArrayList<>();
        int topBound = 0, bottomBound = A.size()-1, leftBound = 0, rightBound = A.get(0).size()-1;
        int directionIndicator = 0;
        while(topBound <= bottomBound && leftBound <= rightBound) {
            if (directionIndicator == 0) {
                for(int i = leftBound; i <= rightBound; i++) {
                    integerList.add(A.get(topBound).get(i));
                }
                topBound++;
                directionIndicator = 1;
            } else if (directionIndicator == 1) {
                for (int i = topBound; i <= bottomBound; i++) {
                    integerList.add(A.get(i).get(rightBound));
                }
                rightBound--;
                directionIndicator = 2;
            } else if (directionIndicator == 2) {
                for (int i = rightBound; i >= leftBound; i--) {
                    integerList.add(A.get(bottomBound).get(i));
                }
                bottomBound--;
                directionIndicator = 3;
            } else {
                for (int i = bottomBound; i >= topBound; i--) {
                    integerList.add(A.get(i).get(leftBound));
                }
                leftBound++;
                directionIndicator = 0;
            }
        }
        return integerList;
    }
}
