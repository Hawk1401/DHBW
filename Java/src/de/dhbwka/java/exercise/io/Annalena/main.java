package de.dhbwka.java.exercise.io.Annalena;
import java.io.*;
import java.util.Scanner;


    public class main {

        public static <FW> void main(String[] args) {

            Scanner scan = new Scanner(System.in);
            String s = scan.next();
            int crosstotal = 0;
            int temp = 0;
            for (int i = 0; i < s.length(); i++) {
                temp = Character.getNumericValue(s.charAt(i));
                crosstotal = crosstotal + temp;
            }
            System.out.println(crosstotal);

            File testDir = new File("C:\\Users\\florkoch\\OneDrive - Agilent Technologies\\Documents\\test");
            testDir.mkdir();
            File numbers = new File(testDir, "numbers.txt");
            try {
                numbers.createNewFile();
            } catch (IOException ex) {
                ex.printStackTrace();
            }


            try (Writer fWriter = new FileWriter("C:\\Users\\florkoch\\OneDrive - Agilent Technologies\\Documents\\test\\numbers.txt", true) ) {
                fWriter.append("Die Quersumme von " + s + "  ist " + crosstotal + ". \n");
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
    }
