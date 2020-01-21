package de.dhbwka.java.exercise.arrays;

public class Bubblesort {

  public static void main(String[] args) {
    java.util.Scanner scan = new java.util.Scanner(System.in);
    System.out.print("Please enter an integer number: ");
    int i = scan.nextInt();
    double[] array = new double[i];
    for (int j = 0; j < i; j++) {
      System.out.print("Please enter an double number" + (j + 1) + ": ");
      double x = scan.nextDouble();
      array[j] = x;
    }
    array = sort(array);
    for (int j = 0; j < array.length; j++) {
      System.out.print(array[j] + "  ");
    }
  }

  public static double[] sort(double[] array) {
    double[] sortedArray = array.clone();
    boolean unSorted = true;
    while (unSorted) {
      unSorted = false;
      for (int i = 0; i < sortedArray.length - 1; i++) {
        if (sortedArray[i] > sortedArray[i + 1]) {
          double temp = sortedArray[i];
          sortedArray[i] = sortedArray[i + 1];
          sortedArray[i + 1] = temp;
          unSorted = true;

        }
      }
    }
    return sortedArray;
  }
}
