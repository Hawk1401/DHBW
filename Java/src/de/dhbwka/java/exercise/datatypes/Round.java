package de.dhbwka.java.exercise.datatypes;
/*
Das „Casten“ (dt. die Typumwandlung) von Gleitkommazahlen in ganze Zahlen bedeutet im
Allgemeinen einen Informationsverlust, denn die Nachkommastellen werden abgeschnitten, z.B.
erfolgt im folgenden Programmstück die Ausgabe von 3 bzw. 2 für die ganzzahligen Varianten von Pi
bzw. e
 */

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
