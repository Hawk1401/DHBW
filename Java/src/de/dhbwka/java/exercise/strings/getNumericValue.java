package de.dhbwka.java.exercise.strings;

public class getNumericValue {
    public static void main(String[] args) {
        int size = 26;
        char[] input = new char[size];
        char a = 'a';
        for (int i = 0; i < size ; i++) {
            input[i] = (char)(((int)a) + i);
            System.out.println(input[i]+ " = " + Character.getNumericValue(input[i]));
        }
    }
}
