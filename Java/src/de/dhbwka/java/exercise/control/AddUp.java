package de.dhbwka.java.exercise.control;

/*
Aufgabenstellung:
Entwickeln Sie ein Programm AddUp, das beliebig viele positive Zahlen von der Konsole einliest und
diese Zahlen aufsummiert!
Verwenden Sie als Abbruchkriterium die Eingabe einer negativen Zahl (diese soll nicht mehr
hinzugezählt werden).
Am Ende soll die Summe aller eingegebenen positiven Zahlen ausgegeben werden.
Realisieren Sie AddUp einmal mit einer while-Schleife und einmal mit einer do-while-Schleife!
* */


public class AddUp {

    public static void main(String[] args) {
        AddUPWithDoWhile();
    }

    public static void AddUPWithWhile() {
        java.util.Scanner scan = new java.util.Scanner(System.in);
        System.out.print("Please enter an a number: ");
        double a = scan.nextDouble();
        double summ = 0;
        while (a >= 0) {
            summ += a;
            System.out.print("Please enter an a number: ");
            a = scan.nextDouble();
        }
        System.out.println(summ);
        scan.close();
    }

    public static void AddUPWithDoWhile() {
        java.util.Scanner scan = new java.util.Scanner(System.in);
        System.out.print("Please enter an a number: ");
        double a = scan.nextDouble();
        double summ = 0;
        do {
            a = scan.nextDouble();
            if (a >= 0) {
                summ += a;
                System.out.print("Please enter an a number: ");
            }

        } while (a >= 0);
        System.out.println(summ);
        scan.close();
    }
}
