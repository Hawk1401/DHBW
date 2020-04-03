package de.dhbwka.java.exercise.methods;

public class Fibonacci {

    public static int[] numbers;

    public static void main(String[] args) {

        java.util.Scanner scan = new java.util.Scanner(System.in);
        System.out.print("Please enter an integer number: ");

        int input = scan.nextInt();
        numbers = new int[input];
        fibonacci(input);

        for (int i = 0; i < numbers.length; i++) {
            System.out.println("f( " + (i + 1) + ") " + numbers[i]);
        }
    }

    public static int fibonacci(int n) {
        if (n <= 2) {
            numbers[n - 1] = 1;
            return 1;
        } else {
            int value = fibonacci(n - 1) + fibonacci(n - 2);
            numbers[n - 1] = value;
            return value;
        }
    }
}
