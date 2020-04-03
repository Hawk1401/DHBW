package de.dhbwka.java.exercise.classes.vehicles;

/*
Für die Simulation eines Wettrennens sollen verschiedene Fahrzeugarten objektorientiert modelliert
werden.
Da alle Fahrzeugtypen gemeinsame Eigenschaften haben, definieren wir uns zunächst eine
Basisklasse Vehicle.
Ein Vehicle hat folgende allgemeinen Eigenschaften bzw. Verhalten:
 Die Anzahl der Räder. In der Klasse Vehicle soll diese auf 0 voreingestellt sein.
 Die Maximalgeschwindigkeit vmax.

Für ein Objekt der Klasse Vehicle soll sie auf 0 km/h voreingestellt sein.
 Die aktuelle Position (in km und der Einfachheit halber in nur einer Dimension).
 Die aktuelle Geschwindigkeit (in km/h).
 Man kann die Geschwindigkeit per Methode setSpeed(double speed) setzen.
Die Geschwindigkeit darf die Maximalgeschwindigkeit nicht überschreiten, ggf. wird sie auf
die Maximalgeschwindigkeit reduziert.
 Ein Vehicle kann bewegt werden mit der Methode drive(double minutes).
Diese Methode wird mit einem double-Parameter aufgerufen, der die Anzahl der Minuten
angibt, die sich das Fahrzeug mit der aktuellen Geschwindigkeit vorwärts bewegt. Der
Methodenaufruf ändert natürlich die Position des Fahrzeugs, wenn es mit einer von 0
verschiedenen Geschwindigkeit bewegt wird.
 Die Methode toString()gibt in Form einer Zeichenkette umfassend Auskunft über ein
Fahrzeug (inkl. über dessen aktuelle Position).


a) Schreiben Sie die Klasse Vehicle, indem Sie geeignete Attribute, Konstruktoren und
Methoden definieren!
b) Anschließend sollen einige konkrete Fahrzeuge definiert werden, indem entsprechende Klassen
von Vehicle abgeleitet werden:
 Ein Fahrrad (Bicycle) ist ein Fahrzeug mit 2 Rädern und vmax 30 km/h.
 Ein Auto (Car) ist ein Fahrzeug mit 4 Rädern und vmax 140 km/h.
 Ein Rennwagen (RacingCar) ist ein Auto mit vmax 220 km/h.
 Ein Krankenwagen (Ambulance) ist ein Auto mit einem zusätzlichen Blaulicht, das ein- oder
ausgeschaltet sein kann (neues Attribut!). Außerdem muss der Krankenwagen Methoden
zum Ein- bzw. Ausschalten des Blaulichts anbieten.
Definieren Sie diese Klassen und nutzen Sie dabei so weit wie möglich die Vererbung von
Eigenschaften und Verhalten aus!
(Fortsetzung s. nächste Seite)
 */

public class Vehicle {
    protected int wheels = 0;
    protected int maxSpeed = 0;
    protected int position  = 0;
    protected double Speed = 0;
    public Vehicle(){
    }

    protected void setSpeed(int speed) {
        if(maxSpeed > speed){
            Speed = speed;
        }else {
            Speed = maxSpeed;
        }
    }

    protected void drive(int minutes){
        if(Speed > 0){
            position += (double)Speed / 60 * minutes;
        }
    }

    @Override
    public String toString() {
        String className = this.getClass().getSimpleName();
        return  className + " at position " + position + " km with " + wheels + " at the speed of " + Speed + " km/h of max. " + maxSpeed + " km/h";
    }
}
