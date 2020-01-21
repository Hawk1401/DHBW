package de.dhbwka.java.exercise.control;
/* Aufgabe
* Schreiben Sie eine Java-Applikation NumberGuess, die ein einfaches Ratespiel implementiert!
Bei diesem Ratespiel muss der Benutzer eine zufällig erzeugte Zahl zwischen 1 und 100 erraten.
Als Hinweis bekommt er jeweils angezeigt, ob er zu hoch oder zu niedrig getippt hat.
Die Anzahl der Versuche, die er benötigt, wird mitgezählt.
Der Benutzer soll folgendes eingeben können:
 Spielername
 Jeweils die nächste zu tippende Zahl
 Endabfrage, ob die Applikation beendet werden (Eingabewert: „0“)
oder ein weiteres Spiel durchgeführt werden soll (Eingabewert: „1“).
Das Programm soll nach Eingabe eines Tipps prüfen, ob die aktuelle Eingabe höher, niedriger oder
gleich der gesuchten Zahl ist.
Es soll dann die Nummer des Versuches ausgeben und ob der Tipp zu hoch, zu niedrig oder korrekt
war.
* */

public class NumberGuess {

  public static void main(String[] args) {
    java.util.Scanner scan = new java.util.Scanner(System.in);
    System.out.print("Whats your name?: ");
    String name = scan.next();
    boolean GameISRuning = true;
    int max = 100;
    int min = 1;

    int Numer = (int)(Math.random() * ((max - min) + 1)) + min;

    while (GameISRuning) {
      System.out.println(name + " Whats your Guess?: ");
      int Guess = scan.nextInt();
      if (Numer < Guess) {
        System.out.println(Guess + " Was To high.");
      }
      if (Numer > Guess) {
        System.out.println(Guess + " Was To Low.");
      }
      if (Numer == Guess) {
        System.out.println(Guess + " Is rigth You won!!");

        while (true) {
          System.out.println("Do you Want Too play again (1 = yes / 0 = no)");
          int Again = scan.nextInt();
          if (Again == 1) {
            Numer = (int)(Math.random() * ((max - min) + 1)) + min;
            break;
          }
          if (Again == 0) {
            return;
          }
        }
      }
    }
    scan.close();
  }
}
