package de.dhbwka.java.exercise.datatypes;
/*
Schreiben Sie ein Programm ShortValue, in dem Sie eine short-Variable mit dem Wert 32767
initialisieren und den Wert der Variablen ausgeben!
Erhöhen Sie dann den Wert der Variablen um 1 und geben Sie den neuen Wert der Variablen aus!
Welcher Wert wird ausgegeben und warum? Gibt es eine Fehlermeldung des Laufzeitsystems?
 */
public class ShortValue {

  public static void main(String[] args) {
    short myShort = 32767;
    System.out.println(myShort); // print 32767
    myShort++;
    /*
     *
     * */
    System.out.println(myShort); // print -32768

  }
}
