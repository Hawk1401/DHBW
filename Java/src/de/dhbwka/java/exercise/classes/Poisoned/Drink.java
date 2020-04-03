package de.dhbwka.java.exercise.classes.Poisoned;

public class Drink {
    private static int Index = 0;
    private int index = Index++;
    private boolean poisoned;

    public Drink(boolean poisoned) {
        this.poisoned = poisoned;
    }

    public boolean isPoisoned() {
        return poisoned;
    }
}
