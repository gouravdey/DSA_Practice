package main.practice.udemy.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ReverseString {
    public static void main(String[] args) {
        String string = "My name is Lucas and I am a spider";
        System.out.println(reverseString(string));
    }

    private static String reverseString(String s) {
        List<String> stringList = new ArrayList<>(Arrays.asList(s.split("")));
        String newString = "";
        for (int i=s.length()-1; i>=0; i--) {
            newString = newString.concat(stringList.get(i));
        }
        return newString;
    }
}
