package de.dhbwka.java.exercise.operators;
/*
Aufgabenstellung:
Was gibt das folgende Programm IncrementDecrement aus?
Lösen Sie die Aufgabe zunächst „auf Papier“, kontrollieren Sie das Ergebnis dann am Rechner!

 */

public class IncrementDecrement {

  public static void main(String[] args) {
    int i = 0; // 0
    int j = 0; // 0
    j = ++i; // i = 1 ; j=1
    int k = j++ + ++i; // k = 3; j=2; i =2
    System.out.println("k: " + k); //k: 3
    System.out.println("*: " + j++ + ++i); // *: 23; j =3; i=3
    System.out.println(j++ + ++i); // *: 7; j =4; i=4
    int m = j++ * ++i; // m=20; j =5; i=5
    System.out.println("m: " + m); // m:12
    int n = --j * --i; // n = 16 ; j = 4; i= 4
    System.out.println("n: " + n); // n:16
    System.out.println("i: " + i); // i:4
    System.out.println("j: " + j); // j:4
  }
}
