package de.dhbwka.java.exercise.control;

public class Quadratics {

  public static void main(String[] args) {
    java.util.Scanner scan = new java.util.Scanner(System.in);
    System.out.print("Please enter an a number: ");
    int a = scan.nextInt();
    System.out.print("Please enter an b number: ");
    int b = scan.nextInt();
    System.out.print("Please enter an c number: ");
    int c = scan.nextInt();
    scan.close();
    solv(a,b,c);
  }

  //a x2 + b x + c = 0
  public static void solv(double a, double b, double c) {
    if (a == 0) {
      if (b == 0) {
        System.out.println("err");

      } else {
        if (c == 0) {
          System.out.println("err");

        } else {
          System.out.println(-c / b);
        }
      }
    } else {
      if (b == 0) {
        if (c == 0) {
          System.out.println("err");
        } else {
          System.out.println(Math.sqrt( -c / a));  // x2 = a/c
        }
      } else {
        if (c == 0) {
          if(a > 1){
            a = a / a;
            b = b / a;
          }
        }else {
          if(a > 1){
            a = a / a;
            b = b / a;
            c = c / a;
          }
        }

          double p = b;
          double q = c;
          System.out.println(-(p / 2) + Math.sqrt(Math.pow((p / 2), 2) - q));
          System.out.println(-(p / 2) - Math.sqrt(Math.pow((p / 2), 2) - q));

      }

    }
  }
}
