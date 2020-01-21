package de.dhbwka.java.exercise.control;

/*
Schreiben Sie ein Programm LeapYear, das eine Jahreszahl von der Konsole einliest und dann
bestimmt, ob es sich bei diesem Jahr um ein Schaltjahr handelt!
Das Ergebnis soll auf der Konsole ausgegeben werden.
Ein Jahr ist ein Schaltjahr, wenn es durch vier teilbar ist, nicht aber wenn es durch 100 teilbar ist, es
sei denn, es ist durch 400 teilbar.

 */

public class LeapYear {

  public static void main(String[] args) {
    java.util.Scanner scan = new java.util.Scanner(System.in);
    System.out.print("Please enter an Year number: ");
    int i = scan.nextInt();
    scan.close();
    if (IsALeapYear(i)){
      System.out.println(i + " Is a Leap year");
    }else {
      System.out.println(i + " Is not a Leap year");

    }
  }
  public static boolean IsALeapYear(int year){
    if(year % 4 == 0){
      if (year % 100 ==0){
        return year % 400 == 0;
      }
      return true;
    }
    return false;
  }
}
