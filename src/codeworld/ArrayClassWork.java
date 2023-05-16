package codeworld;

import java.util.Arrays;

public class ArrayClassWork {
    public static void main(String[] args) {
        int size = 10;
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = i + 1;
        }
        System.out.println(Arrays.toString(array));

    }


    public static int[] insertElementsCheck(int[] var) {
        int size = 12;
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = i + 1;
        }


        return array;
    }
}