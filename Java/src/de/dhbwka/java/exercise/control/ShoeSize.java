package de.dhbwka.java.exercise.control;

/*
*
* Aufgabenstellung:
Für die Umrechnung der in Deutschland üblichen Schuhgrößen in Zentimeter gilt die folgende
Beziehung:
Schuhgröße = Zentimeter * 1,5
* */


public class ShoeSize {

  public static void main(String[] args) {
    CreateTable();
  }
  public static  void CreateTable(){
    //Schuhgröße = Zentimeter * 1,5
    System.out.println("centimeters   | Size");
    System.out.println("--------------|-------");
    int Size = 30;
    for (int i = 0; i<20; i++){
      String outPut = "";
      double Mincm = (double)(Size + i -1 ) / 1.5;
      double Maxcm = (double)(Size + i -1 ) / 1.5;
      outPut = outPut + String.format("%1$,.2f - ", Mincm);
      outPut = outPut + String.format("%1$,.2f | ", Mincm);
      outPut = outPut + String.format("%4s | ", Integer.toString(Size + i));
    System.out.println(outPut);

    }
  }
}
