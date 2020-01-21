package de.dhbwka.java.exercise.arrays;
/*
Schreiben Sie ein Programm StandardDeviation, das von den zufällig erzeugten Werten eines
Arrays beliebiger Größe den Mittelwert und die Standardabweichung berechnet.

Das Array soll eine Größe von n = 100 haben, die zufälligen Werte können mit Hilfe der Methode
Math.random() oder der Klasse java.util.Random erzeugt werden und sollen ganzzahlige
Werte zwischen 0 und 10 haben.


 */

public class StandardDeviation {

  public static void main(String[] args) {
    int[] myArrays = new int[100];
    int max = 10;
    int min = 0;
    for (int i = 0; i<myArrays.length; i++){
      int Numer = (int)(Math.random() * ((max - min) + 1)) + min;
      myArrays[i] = Numer;
    }

    GetStandardDeviation(myArrays);
  }
    public static void GetStandardDeviation(int[] myArray){
      int Average = GetAverage(myArray);
      int sum = 0;
      for (int value : myArray) {
        sum += Math.pow(value - Average, 2);
      }
      double StandardDeviation = sum / myArray.length -1 ;
      StandardDeviation = Math.sqrt(StandardDeviation);

      System.out.println(Average);
      System.out.println(StandardDeviation);
    }
  public static int GetAverage(int[] myArray){
    int sum = 0;
    for (int value : myArray) {
      sum += value;
    }
    int Average = sum / myArray.length ;
    return Average;
  }
}

