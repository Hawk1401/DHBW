package de.dhbwka.java.exercise.arrays;

public class Norm {

    public static void main(String[] args) {
        java.util.Scanner scan = new java.util.Scanner(System.in);
        System.out.print("Please enter an integer number: ");
        int i = scan.nextInt();
        double[] array = new double[i];
        for (int j = 0; j < i; j++) {
            System.out.print("Please enter an double number for X_" + (j + 1) + ": ");
            double x = scan.nextDouble();
            array[j] = x;
        }
        scan.close();
        NormVector(array);
        System.out.println(NormVector(array));
    }

    public static double NormVector(double[] array) {
        double sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i] * array[i];
        }
        return Math.sqrt(sum);
    }
}
