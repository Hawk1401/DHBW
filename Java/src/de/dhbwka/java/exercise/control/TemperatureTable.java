package de.dhbwka.java.exercise.control;

/*
Erstellen Sie ein Programm zur Ausgabe einer Temperaturtabelle von Fahrenheit (f) nach Celsius (c)!
Die Tabelle soll bei 0° F beginnen und bei 300° F enden. Die Abstände der Stützstellen sollen 20° F
betragen.
Der funktionale Zusammenhang von c und f ist gegeben durch die Formel:
c = (5 / 9) * ( f - 32)
 */

public class TemperatureTable {

  public static void main(String[] args) {
    for (double f = 0; f < 301; f++){
      double c = 0;

      c = (0.5555555555555556) * ( f - 32);
      PrintTable(f, c);
    }
  }
  public static void PrintTable(double f, double c){
   System.out.println( String.format("|%-20s|%-20s|", Double.toString(f), Double.toString(c)));
  }
}
