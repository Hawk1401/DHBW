package de.dhbwka.java.exercise.arrays;
/*
Schreiben Sie ein Programm Fibonacci, das die ersten 20 (50) Fibonacci-Zahlen berechnet,
gemäß ihrem Index in einem Array speichert und die Zahlen anschließend ausgibt!
 */
public class Fibonacci {

  public static void main(String[] args) {
    long[] FibonacciNumbers = new long[50];
    FibonacciNumbers[0] = 1;
    FibonacciNumbers[1] = 1;
    for (int i = 2; i < FibonacciNumbers.length; i++) {
      FibonacciNumbers[i] =  FibonacciNumbers[i- 1] +  FibonacciNumbers[i- 2];
    }
    for (int i = 0; i < FibonacciNumbers.length; i++) {
      System.out.println(FibonacciNumbers[i]);
    }
  }
}
