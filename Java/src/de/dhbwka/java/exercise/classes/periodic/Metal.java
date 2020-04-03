package de.dhbwka.java.exercise.classes.periodic;

/*
Die Klasse Metal soll von Element erben und folgende zusätzliche Eigenschaften haben:
 metalloid: boolean (true wenn es sich um ein Halbmetall (engl. „metalloid“) handelt)
 conductivity: double (Leitfähigkeit,  (sigma, Unicode-Zeichen \u03C3))
Implementieren Sie auch hierfür die entsprechenden getter-/setter-Methoden!
Erweitern Sie die Konstruktoren für Metal für diese Eigenschaften!
Überschreiben Sie die Methode toString() so, dass auch die zusätzlichen Eigenschaften von
Metall ausgegeben werden.
 */
public class Metal extends Element {


    public boolean metalloid;
    public double conductivity;


    public Metal(String name, String symbol, int ordinal, int phase, char shell, boolean group, boolean metalloid, double conductivity) {
        super(name, symbol, ordinal, phase, shell, group);
        this.metalloid = metalloid;
        this.conductivity = conductivity;
    }

    @Override
    public String toString() {
        String phaseString = "";
        switch (phase) {
            case 1:
                phaseString = "solid";
                break;
            case 2:
                phaseString = "Liquid";
                break;
            case 3:
                phaseString = "Gas";
                break;
        }
        String GroupString = "SIDE";
        if (Group) {
            GroupString = "Main";
        }
        return Name + " (" + Symbol + " " + ordinal + ") Shell: " + shell + " " + phaseString + ", Group: " + GroupString + " " + "\u03C3" + conductivity;
    }

    public boolean isMetalloid() {
        return metalloid;
    }

    public void setMetalloid(boolean metalloid) {
        this.metalloid = metalloid;
    }

    public double getConductivity() {
        return conductivity;
    }

    public void setConductivity(double conductivity) {
        this.conductivity = conductivity;
    }
}
