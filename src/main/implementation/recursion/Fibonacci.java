package main.implementation.recursion;

public class Fibonacci {
    public static void main(String[] args) {
        System.out.println(fibonacci(1));
        System.out.println(fibonacci(2));
        System.out.println(fibonacci(3));
        System.out.println(fibonacci(4));
        System.out.println(fibonacci(5));
        System.out.println(fibonacci(6));
        System.out.println(fibonacci(7));
        System.out.println(fibonacci(8));
        System.out.println(fibonacci(9));
        System.out.println(fibonacci(10));
        System.out.println(fibonacci(11));
        System.out.println(fibonacci(12));
        System.out.println(fibonacci(13));
        System.out.println(fibonacci(14));
        System.out.println(fibonacci(15));
    }

    public static int fibonacci(int number) {
        if (number == 1 || number == 2) {
            return --number;
        }
        return fibonacci(number-2) + fibonacci(number-1);
    }
}
