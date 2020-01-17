package de.dhbwka.java.exercise.operators;

public class Easter {

  public static void main(String[] args) {
    java.util.Scanner scan = new java.util.Scanner(System.in);
    System.out.print("Please enter an integer number: ");
    int i = scan.nextInt();
    GetEaster(i);
  }

  public static int GetEaster(int year) {
    int a = year % 19;
    int b = year % 4;
    int c = year % 7;

    int k = year / 100;
    int p = (8 * k + 13) / 25;
    int q = k / 4;
    int m = (15 + k - p - q) % 30;

    int n = (4 + k - q) % 7;
    int d = (19 * a + m) % 30;
    int e = (2 * b + 4 * c + 6 * d + n) % 7;
    int easter = (22 + d + e);
    if (easter > 31) {
      easter -= 31;
    }
    System.out.print(easter);

    return easter;
  }
}
