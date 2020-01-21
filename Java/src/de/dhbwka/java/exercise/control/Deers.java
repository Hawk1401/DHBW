package de.dhbwka.java.exercise.control;
/*
Der Wildbestand eines Forstes umfasst zu Beginn 200 Hirsche.
Die jährliche Vermehrung beträgt 10% des Jahresanfangsbestands; im Herbst werden 15 Stück zum
Abschuss freigegeben.
Wie entwickelt sich der Bestand in den nächsten Jahren?
Erstellen Sie ein Programm Deers, das den jährlichen Wildbestand ermittelt und ausgibt, bis dieser
mindestens die Zahl 300 erreicht hat!

 */

public class Deers {

  public static void main(String[] args) {
    int DeerNumber = 200;
    int yearsCounter = 0;
    while (DeerNumber < 300){
      DeerNumber = NumbersOFDeers(DeerNumber);
      DeerNumber = DeerNumber -15; // killing 15 Deers
      System.out.println("After "+ ++yearsCounter + " Years There are "+ DeerNumber + " Living in the forest");
    }
  }
  public static  int  NumbersOFDeers(int oldNumbers){
    return (int)(oldNumbers * 1.1);
  }
}
