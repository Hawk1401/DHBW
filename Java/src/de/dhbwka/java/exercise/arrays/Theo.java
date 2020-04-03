package de.dhbwka.java.exercise.arrays;

public class Theo {


    public static void main(String[] args) {
        for (int i = 0; i < 70; i++) {
            int[] test = new int[i+1];
            System.out.println(test.length + " = " + bubbleSort(test));
        }
    }


    public static  int bubbleSort(int[] arr){
        int total = 0;
        for (int i = arr.length - 1; i > 0 ; i--) {
            int curren = 1;
            for (int j = 0; j < i; j++) {
                curren++;
                if(arr[j] > arr[j + 1]){
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
            //System.out.println("current = " + curren);

            total += curren;
        }
        //System.out.println("total = " +total);
        return total;
    }
}
