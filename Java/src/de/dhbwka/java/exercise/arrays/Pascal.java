package de.dhbwka.java.exercise.arrays;

import org.junit.platform.commons.util.StringUtils;

public class Pascal {
    public static void main(String[] args) {
        long[][] arr = getPascal(10);
        for (int i = 0; i < arr.length; i++) {
            String outPut = "";
            for (int j = 0; j < arr[i].length; j++) {
                outPut += String.format("%4s", Long.toString(arr[i][j]));
            }
            System.out.print(StringUtils.center(outPut, 50) + "\n");
        }
    }
    public static long[][] getPascal(int MaxSize){
        long[][]test = new long[MaxSize][];
        test[0] = new long[1];
        test[0][0] = 1;
        for (int i = 1; i <test.length ; i++) {
            test[i] = new long[i + 1];
            for (int j = 0; j < test[i].length; j++) {
                if(j-1 <0){
                    test[i][j] = 0 + test[i - 1][j];
                }else if(test[i - 1].length <= j){
                    test[i][j] = test[i - 1][j - 1] + 0;
                }else{
                    test[i][j] = test[i - 1][j - 1] + test[i - 1][j];
                }
            }
        }
        return test;
    }
    static class StringUtils {

        public static String center(String s, int size) {
            return center(s, size, ' ');
        }

        public static String center(String s, int size, char pad) {
            if (s == null || size <= s.length())
                return s;

            StringBuilder sb = new StringBuilder(size);
            for (int i = 0; i < (size - s.length()) / 2; i++) {
                sb.append(pad);
            }
            sb.append(s);
            while (sb.length() < size) {
                sb.append(pad);
            }
            return sb.toString();
        }
    }
}
