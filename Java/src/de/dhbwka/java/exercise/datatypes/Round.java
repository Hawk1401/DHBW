package de.dhbwka.java.exercise.datatypes;

public class Round {

  public static void main(String[] args) {
    double pi = 3.1415926; // Naeherung der Kreiszahl Pi
    double e = 2.7182818; // Naeherung der Eulerschen Zahl e

    System.out.println(round(pi));
    System.out.println(round(e));
  }
  private static int round(double decimal){
    if(decimal - (int)decimal >= 0.5){
      return  (int)decimal +1;
    }
    return (int)decimal;
  }
}
