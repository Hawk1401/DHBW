package de.dhbwka.java.exercise.datatypes;

public class Round {

  public static void main(String[] args) {
    double pi = 3.1415926; // Naeherung der Kreiszahl Pi
    double e = 2.7182818; // Naeherung der Eulerschen Zahl e

    System.out.println("Pi = " + round(pi));
    System.out.println("e = " + round(e));
  }

  public static int round(double decimal) {
    if (decimal > 0) {
      if (decimal - (int) decimal >= 0.5) {
        return (int) decimal + 1;
      }
      return (int) decimal;
    } else {
      if (decimal - (int) decimal <= -0.5) {
        return (int) decimal - 1;
      }
      return (int) decimal;
    }
  }
}
