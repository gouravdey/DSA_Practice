package main.implementation.recursion;

public class StringReverse {
    public static void main(String[] args) {
        String string = "GOURAV DEY";
        System.out.println(reverseString(string));
    }

    public static String reverseString(String string) {
        while (!string.isEmpty()) {
            return reverseString(string.substring(1)) + string.charAt(0);
        }
        return string;
    }
}
