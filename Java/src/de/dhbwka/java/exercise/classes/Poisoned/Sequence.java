package de.dhbwka.java.exercise.classes.Poisoned;

import java.util.Random;

public class Sequence {
    private Drink[] Drinks;
    private double Rate = -1;
    private int Amount;
    private int Checks = 0;

    public Sequence(int Size, double rate) {
        Drinks = new Drink[Size];
        this.Rate = rate;
        Random rnd = new Random();
        this.Amount = 0;
        for (int i = 0; i < Drinks.length; i++) {
            boolean value = rnd.nextDouble() < this.Rate;
            if (value) {
                this.Amount++;
            }
            Drinks[i] = new Drink(value);
        }
    }

    public Sequence(int Size, int amount) {
        Drinks = new Drink[Size];
        this.Amount = amount;
        for (int i = 0; i < Drinks.length; i++) {
            Drinks[i] = new Drink(i < this.Amount);
        }
        Drinks = RandomizeArray(Drinks);
    }

    private static Drink[] RandomizeArray(Drink[] array) {
        Random rgen = new Random();  // Random number generator

        for (int i = 0; i < array.length; i++) {
            int randomPosition = rgen.nextInt(array.length);
            Drink temp = array[i];
            array[i] = array[randomPosition];
            array[randomPosition] = temp;
        }
        return array;
    }

    public int getChecks() {
        return Checks;
    }

    public int getAmount() {
        if (this.Rate == -1) {
            return this.Amount;
        }
        return -1;
    }

    public boolean isPoisoned(int[] indexes) {
        for (int i = 0; i < indexes.length; i++) {
            if (Drinks[indexes[i]].isPoisoned()) {
                return true;
            }
        }
        return false;
    }

    public boolean isPoisoned(int startIndex, int endIndex) {
        for (int i = 0; i < endIndex - startIndex; i++) {
            if (Drinks[startIndex + i].isPoisoned()) {
                return true;
            }
        }
        return false;
    }

    public boolean foundAll(int[] guess){
        if(Drinks.length != this.Amount){
            return false;
        }
        for (int i = 0; i < guess.length ; i++) {
            if(!Drinks[guess[i]].isPoisoned()){
                return false;
            }
        }
        return true;
    }
}
