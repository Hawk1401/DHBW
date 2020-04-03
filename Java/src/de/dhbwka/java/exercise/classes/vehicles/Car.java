package de.dhbwka.java.exercise.classes.vehicles;

public class Car extends Vehicle {
    public Car(int Speed) {
        wheels = 4;
        maxSpeed = 140;
        setSpeed(Speed);
    }
}
