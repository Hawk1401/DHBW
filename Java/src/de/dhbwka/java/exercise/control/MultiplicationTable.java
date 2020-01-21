package de.dhbwka.java.exercise.control;
/*
Aufgabenstellung:
Entwickeln Sie ein Programm MultiplicationTable, welches das kleine Einmaleins in
Tabellenform (10x10-Tabelle) ausgibt!

 */

public class MultiplicationTable {

  public static void main(String[] args) {
    for (int i = 1 ; i<11; i++){
      PrintLine(i);
    }

  }
  public  static void PrintLine(int line){
    String outPut = "";
    for (int i = 1 ; i<11; i++){
      int number = i * line;
      outPut += String.format("%-3s", Integer.toString(number));
    }
    System.out.println(outPut);
  }
}
