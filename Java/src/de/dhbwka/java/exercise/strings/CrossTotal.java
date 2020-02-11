package de.dhbwka.java.exercise.strings;

public class CrossTotal {
    public static void main(String[] args) {
        java.util.Scanner scan = new java.util.Scanner(System.in);

        System.out.print("Please enter an integer number: ");
        String input = scan.next();
        int Cross = 0;
        for (int i = 0; i < input.length(); i++) {
            Cross += Character.getNumericValue(input.charAt(i));
        }
        System.out.println(Cross);
    }
}
