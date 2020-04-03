package de.dhbwka.java.exercise.classes.periodic;

import java.util.Objects;

/*
 Name: String
 Symbol: String (z.B. „H“ für Wasserstoff)
 Ordnungszahl (auch: Kernladungszahl, engl. „ordinal“): int
 Schale (engl. „shell“): char
 Aggregatzustand (engl. „phase“) bei 25°C (298K): int (SOLID=1, LIQUID=2, GAS=3)
 Hauptgruppe/Nebengruppe (H/N): boolean (MAIN=true, SIDE=false)
 */
public class Element {

    public String Name;
    public String Symbol;
    public int ordinal;
    public int phase;
    public char shell;
    public boolean Group;


    public Element(String name, String symbol, int ordinal, int phase, char shell, boolean group) {
        Name = name;
        Symbol = symbol;
        this.ordinal = ordinal;
        this.phase = phase;
        this.shell = shell;
        Group = group;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Element)) return false;
        Element that = (Element) o;
        return ordinal == that.ordinal;
    }

    public boolean equals(int o) {
        return ordinal == o;
    }

    @Override
    public String toString() {
        String phaseString = "";
        switch (phase){
            case 1:
                phaseString ="solid";
                break;
            case 2:
                phaseString ="Liquid";
                break;
            case 3:
                phaseString ="Gas";
                break;
        }
        String GroupString = "SIDE";
        if(Group){
            GroupString = "Main";
        }
        return Name + " (" + Symbol + " " + ordinal +") Shell: " + shell + " " + phaseString + ", Group: "  + GroupString ;
    }

    @Override
    public int hashCode() {
        return Objects.hash(ordinal);
    }

    public int getOrdinal() {
        return ordinal;
    }

    private void setOrdinal(int ordinal) {
        this.ordinal = ordinal;
    }

    public int getPhase() {
        return phase;
    }

    private void setPhase(int phase) {
        this.phase = phase;
    }

    public char getShell() {
        return shell;
    }

    private void setShell(char shell) {
        this.shell = shell;
    }

    public boolean isGroup() {
        return Group;
    }

    private void setGroup(boolean group) {
        Group = group;
    }

    public String getSymbol() {
        return Symbol;
    }

    private void setSymbol(String symbol) {
        Symbol = symbol;
    }
    public String getName() {
        return Name;
    }

    private void setName(String name) {
        Name = name;
    }

}
