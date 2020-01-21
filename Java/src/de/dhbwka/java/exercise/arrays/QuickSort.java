package de.dhbwka.java.exercise.arrays;

public class QuickSort {
    double[] data = new double[40];
    public static void main(String[] args) {
        double[] data = new double[40000000];
        int max = 100000;
        int min = 1;


        for (int i = 0; i < data.length; i++) {
            double Numer = ((Math.random() * ((max - min) + 1)) + min);
            data[i] = Numer;
        }
        System.out.println("go");
        QuickSort stuff = new QuickSort();
        stuff.start(data);
    }
    public void start(double[] array){
        data = array;
        quickSort(0 ,data.length -1);
        /*for (int i = 0; i < data.length; i++) {
            System.out.println(data[i]);
        }*/
    }
    public void quickSort(int left, int right){
        if (left < right){
            int splied = spliter(left, right);
            quickSort(left, splied-1);
            quickSort(splied+1, right );
        }
    }
    private int spliter(int left, int right){
        int i = left;
        int j = right - 1;
        double pivot =  data[right];
        do {
            while(i< right && data[i] < pivot){
                i++;
            }
            while(j > left && data[j] >= pivot){
                j--;
            }
            if(i<j){
                double temp = data[i];
                data[i] = data[j];
                data[j] = temp;
            }
        }while (i < j);

        double temp = data[i];
        data[i] = data[right];
        data[right] = temp;
        return i;
    }
}
