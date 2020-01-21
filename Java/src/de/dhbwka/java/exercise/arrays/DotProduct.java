package de.dhbwka.java.exercise.arrays;

public class DotProduct {

  public static void main(String[] args) {
    DotProduct dotProduct = new DotProduct();
    java.util.Scanner scan = new java.util.Scanner(System.in);
    System.out.print("Please enter an integer number: ");
    int i = scan.nextInt();
    double[] arrayX = new double[i];
    double[] arrayY = new double[i];
    for (int j = 0; j < i; j++) {
      System.out.print("Please enter an double number for X_" + (j + 1) + ": ");
      double x = scan.nextDouble();
      arrayX[j] = x;
    }
    for (int j = 0; j < i; j++) {
      System.out.print("Please enter an double number for Y_" + (j + 1) + ": ");
      double y = scan.nextDouble();
      arrayY[j] = y;
    }
    System.out.print(GetDotProduct(arrayX, arrayY));
  }

  public static double GetDotProduct(double[] arrayX, double[] arrayY) {
    if (arrayX.length != arrayY.length) {
      throw new ArithmeticException("the length of arrayX and arrayY are not the same");
    }
    double sum = 0;
    for (int i = 0; i < arrayX.length; i++) {
      sum += arrayX[i] * arrayY[i];
    }
    return sum;
  }
}
