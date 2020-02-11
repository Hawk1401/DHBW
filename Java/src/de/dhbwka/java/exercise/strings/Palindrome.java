package de.dhbwka.java.exercise.strings;

public class Palindrome {
    public static void main(String[] args) {
        java.util.Scanner scan = new java.util.Scanner(System.in);

        System.out.print("Please enter an Word: ");
        String input = scan.next();
        String outPut = "";
        for (int i = input.length() - 1; i >= 0 ; i--) {
            outPut += input.charAt(i);
        }
        System.out.println(outPut);
    }
}
