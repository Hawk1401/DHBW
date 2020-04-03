package de.dhbwka.java.exercise.arrays;

import java.util.Random;

public class Countingsort {
    public static void main(String[] args) {


        Random rgen = new Random();  // Random number generator
        QuickSort quick = new QuickSort();
        int[] test = new int[200];
        for (int k = 0; k < 10; k++) {

            int[][] arrs = new int[100][8000];
            for (int i = 0; i < arrs.length; i++) {
                arrs[i] = new int[arrs[0].length];
                for (int j = 0; j < arrs[0].length; j++) {
                    arrs[i][j] = rgen.nextInt(2) + 1;
                }
            }

            long start = System.currentTimeMillis();

            for (int i = 0; i < arrs.length; i++) {
                for (int j = 0; j < arrs[0].length; j++) {
                    //sort(arrs[i], 2, 0);
                    quick.start(arrs[i]);
                }
            }
            long finish = System.currentTimeMillis();
            long timeElapsed = finish - start;
            System.out.println(timeElapsed + " ms");
        }
    }

    public static int[] sort(int[] arr, int macValue, int offset) {
        //HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        int[] map = new int[macValue + offset];
        for (int i = 0; i < arr.length; i++) {
            map[arr[i] - 1 + offset] += 1;
        }
        int index = 0;
        for (int i = 0; i < map.length; i++) {
            for (int j = map[i]; j > 0; j--) {
                arr[index++] = i + 1 - offset;
            }
        }
        return arr;
    }
}
