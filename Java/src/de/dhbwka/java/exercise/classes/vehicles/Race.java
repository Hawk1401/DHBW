package de.dhbwka.java.exercise.classes.vehicles;

public class Race {
    public static void main(String[] args) {
            Vehicle[] vehicles = new Vehicle[4];
            vehicles[0] = new Bicycle(20);
            vehicles[1] = new Car(150);
            vehicles[2] = new RacingCar(200);
            vehicles[3] = new Ambulance(80, true);
// 4 hours lead for the bike
            vehicles[0].drive(240);
// 1 hour of driving for everyone
            for (int i = 0; i < vehicles.length; i++) {
                vehicles[i].drive(60);
            }
// Output Race
            for (int i = 0; i < vehicles.length; i++) {
                System.out.println(vehicles[i].toString());
            }
        }
}
