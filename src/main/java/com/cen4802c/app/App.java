package com.cen4802c.app;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        var value = 10;
        var result = recursive_Fibonacci(value);
        System.out.println("The Fibonacci sequence for " + value + " is " + result);
    }


    /**
     * This static method calculates a Fibonacci sequence result via being a recursive function.
     * @param numberToCheck The number to check the Fibonacci sequence with.
     * @return The resulting calculation of the Fibonacci sequence.
     */
    public static int recursive_Fibonacci(int numberToCheck) {
        return numberToCheck <= 1 ? numberToCheck : recursive_Fibonacci(numberToCheck - 1) + recursive_Fibonacci(numberToCheck - 2);
    }
}
