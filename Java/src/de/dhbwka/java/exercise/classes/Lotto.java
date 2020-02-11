package de.dhbwka.java.exercise.classes;

import java.util.concurrent.ThreadLocalRandom;

public class Lotto {
    /*
    Bei einem (vereinfachten) deutschen Lottospiel werden 6 Kugeln aus einer Anzahl von 49 Kugeln
gezogen. Implementieren Sie eine Klasse, die ein beliebiges Lottospiel simuliert.
a) Implementieren Sie dazu einen geeigneten Konstruktor der Art:
Lotto(int m, int n)
Damit soll ein Lottospiel der Art m Kugeln aus n erzeugt werden. Das deutsche Lotto müsste
damit wie folgt erzeugt werden:
Lotto deutschesLotto = new Lotto(6,49);
b) Die Klasse Lotto soll folgende Attribute besitzen:
 ein Attribut, das die Anzahl der zu ziehenden Kugel beschreibt,
 ein Attribut, das die Gesamtzahl der Kugel beschreibt,
 ein Array, das Ihren Tipp enthält,
 ein Array, das die gezogenen Zahlen enthält.
c) Schreiben Sie zu der Klasse Lotto die folgenden Methoden:
<Typ> tippen()
Diese Methode frägt Sie nach Ihrem Tipp. Die Methode muss sicherstellen, dass die getippten
Zahlen im erlaubten Zahlenbereich sind.
<Typ> tippen(int[] tipp)
Diese Methode fragt Sie nicht nach Ihrem Tipp sondern erhält ein Array von Zahlen mit Ihrem
Tipp. (Gut geeignet zum Testen der Klasse, damit man nicht immer alle Zahlen eingeben muss.)
<Typ> ziehen()
Diese Methode führt eine Ziehung der Zahlen durch, d.h. erstellt eine entsprechende Anzahl an
zufälligen Zahlen.
int richtige()
Diese Methode ermittelt, wie viele richtige Zahlen Sie bei Ihrem Tipp hatten.
public String toString()
Diese Methode gibt den Zustand Ihres Lottospiels aus. Falls sie schon getippt haben, soll Ihr Tipp
ausgegeben werden. Falls die Ziehung schon erfolgte, sollen auch die gezogenen Zahlen
ausgegeben werden. Die Zahlen sollen dabei in aufsteigender Reihenfolge ausgegeben werden.
Am besten sortieren Sie dazu die beiden Arrays, die die Klasse als Attribute besitzt.
Beispielausgabe:
Geben Sie bitte Ihren Tipp für die 1. Zahl ein: 22
Geben Sie bitte Ihren Tipp für die 2. Zahl ein: 11
Geben Sie bitte Ihren Tipp für die 3. Zahl ein: 33
Geben Sie bitte Ihren Tipp für die 4. Zahl ein: 1
Geben Sie bitte Ihren Tipp für die 5. Zahl ein: 49
     */
    private int[] guessArr, pulledNumberes;
    private int maxValue;
    public Lotto(int pullAmount, int maxValueInput){
        guessArr = new int[pullAmount];
        pulledNumberes = new int[pullAmount];
        maxValue = maxValueInput;
        pullTheNumbers();
    }
    private void pullTheNumbers(){
        int min = 1;

        for (int i = 0; i < pulledNumberes.length; i++) {
            int randomNum = ThreadLocalRandom.current().nextInt(min, maxValue + 1);
            pulledNumberes[i] = randomNum;
        }
    }
    public void Guess(){
        java.util.Scanner scan = new java.util.Scanner(System.in);

        for (int i = 0; i < guessArr.length; i++) {
            System.out.print("Please enter an integer number: ");
            int input = scan.nextInt();
            if(input > 0 && input <= maxValue){
                guessArr[i] = input;
            }else{
                i--;
                System.out.print("number was to not in the giving range");
            }
        }
    }

    public boolean Guess(int[] intputArr){
        if(intputArr.length == guessArr.length){
            for (int i = 0; i < intputArr.length; i++) {

            }
        }
        return false;
    }


    public static void main(String[] args) {

    }
}
