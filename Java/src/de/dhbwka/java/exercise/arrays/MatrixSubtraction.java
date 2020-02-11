package de.dhbwka.java.exercise.arrays;

public class MatrixSubtraction {
    public static void main(String[] args) {
        int[][] x = Matrix.geTArray(4, 4, 1, 100);
        int[][] y = Matrix.geTArray(4, 4, 1, 100);
        int[][] z =Matrix.SubMatrix(x,y);
        System.out.println("Matix x");
        Matrix.print(x);

        System.out.println("Matix y");
        Matrix.print(y);

        System.out.println("Matix Result");
        Matrix.print(z);


    }
}

class Matrix {
    public static void print(int[][] arr){
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                System.out.print(String.format("%4s", Integer.toString(arr[i][j])));
            }
            System.out.print("\n");
        }
        System.out.print("-------------------------\n");
    }
    public static int[][] geTArray(int heigth, int width, int minValue, int maxValue) {
        int[][] newArr = new int[heigth][width];
        for (int i = 0; i < heigth; i++) {
            for (int j = 0; j < width; j++) {
                newArr[i][j] = (int) (Math.random() * ((maxValue - minValue) + 1)) + minValue;
            }
        }
        return newArr;
    }

    public static int[][] SubMatrix(int[][] x, int[][] y) {
        if (x.length != y.length || x[0].length != y[0].length) {
            return null;
        }
        int[][] newArr = new int[x.length][x[0].length];
        for (int i = 0; i < x.length; i++) {
            for (int j = 0; j < x[0].length; j++) {
                newArr[i][j] = x[i][j] - y[i][j];
            }
        }
        return newArr;
    }
}
