package de.dhbwka.java.exercise.classes.vehicles;

public class Ambulance extends Car {
    public boolean flashingBlueLight = false;
    public Ambulance(int Speed, boolean FlashingBlueLight) {
        super(Speed);
        flashingBlueLight = FlashingBlueLight;
    }

    public void TurnFlashingBlueLightOn(){
        flashingBlueLight = true;
    }
    public void TurnFlashingBlueLightOff(){
        flashingBlueLight = false;
    }

    @Override
    public String toString() {
        String result;
        String className = this.getClass().getSimpleName();
        result = className + " at position " + position + " km with " + wheels + " at the speed of " + Speed + " km/h of max. " + maxSpeed + " km/h and the Flashing Blue Light is";
        if (flashingBlueLight) {
            result += " On";
        } else {
            result += " Off";
        }
        return result;
    }
}
