package de.dhbwka.java.exercise.control;

/*
*
* Aufgabenstellung:
Das Babylonische Wurzelziehen (oft auch Heron-Verfahren) ist ein alter iterativer Algorithmus zur
Bestimmung einer rationalen Näherung der Quadratwurzel einer Zahl. Es ist ein Spezialfall des
Newton-Verfahrens.
* */

public class Babylon {

  public static void main(String[] args) {
    double xn = 1;
    double a = 25;
    while(true){
      double newXn = Solve(xn, a);
      System.out.println(newXn);
      if(Math.abs(xn - newXn) < 10e-6){
        break;
      }
      xn = newXn;

    }
  }
  public  static  double Solve( double xn, double a){
    double number =   (xn + (a / xn)) / 2;
    return number;
  }
}
