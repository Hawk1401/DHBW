package de.dhbwka.java.exercise.strings;

import java.util.Scanner;

/*
M = 1000
D = 500
C = 100
L = 50
X = 10
V = 5
I = 1
 */
public class RomanNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input = scan.next();
        int sum = 0;
        for (int i = 0; i < input.length() - 1; i++) {
            char a = input.charAt(i);
            char b = input.charAt(i + 1);
            if (isSubtract(a, b)) {
                sum += SubtractTowNum(a, b);
                ++i;
            } else {
                sum += GetNumValue(a);
            }
        }
        if(!isSubtract(input.charAt(input.length() - 2), input.charAt(input.length() - 1))){
            sum += GetNumValue(input.charAt(input.length() - 1));
        }
        System.out.println(sum);
    }

    public static int GetNumValue(char input) {
        input = Character.toUpperCase(input);

        switch (input) {
            case 'I':
                return 1;
            case 'V':
                return 5;
            case 'X':
                return 10;
            case 'L':
                return 50;
            case 'C':
                return 100;
            case 'D':
                return 500;
            case 'M':
                return 1000;
        }
        return -1;
    }

    public static int GetIndexValue(char input) {
        input = Character.toUpperCase(input);

        switch (input) {
            case 'I':
                return 0;
            case 'V':
                return 1;
            case 'X':
                return 2;
            case 'L':
                return 3;
            case 'C':
                return 4;
            case 'D':
                return 5;
            case 'M':
                return 6;
        }
        return -1;
    }

    public static int GetIndexValue(String input) {
        return GetIndexValue(input.charAt(0));
    }

    public static int GetNumValue(String input) {
        return GetNumValue(input.charAt(0));
    }

    public static boolean isSubtract(char a, char b) {
        boolean canBeSubtract = GetIndexValue(a) == 0 || GetIndexValue(a) == 2 || GetIndexValue(a) == 4;

        if (canBeSubtract && GetIndexValue(a) < GetIndexValue(b)) {
            return true;
        }
        return false;
    }

    public static int SubtractTowNum(char a, char b) {
        int sum = 0;
        sum = GetNumValue(b) - GetNumValue(a);
        return sum;
    }
}
