package main.implementation.recursion;

public class Factorial {
    public static void main(String[] args) {
        System.out.println(factorial(1));
        System.out.println(factorial(2));
        System.out.println(factorial(3));
        System.out.println(factorial(4));
        System.out.println(factorial(5));
        System.out.println(factorial(6));
        System.out.println(factorial(7));
        System.out.println(factorial(8));
        System.out.println(factorial(9));
        System.out.println(factorial(10));
        System.out.println(factorial(11));
        System.out.println(factorial(12));
        System.out.println(factorial(13));
        System.out.println(factorial(14));
        System.out.println(factorial(15));
    }

    public static int factorial(int number) {
        if (number == 0) {
            return 1;
        }
        return number * factorial(number-1);
    }
}
