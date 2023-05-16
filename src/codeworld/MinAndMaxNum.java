package codeworld;

public class MinAndMaxNum {
    public static int[] getMinMax(int[] arr) {
        int[] arrays = new int[2];
        arrays[0] = arr[0];
        arrays[1] = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < arrays[0]) {
                arrays[0] = arr[i];
            }
            if (arr[i] > arrays[1]) {
                arrays[1] = arr[i];
            }
        }

        return arrays;
    }

    public static void main(String[] args) {
        int[] arr = {8, 57, 1, 7, 26, 50, 60, 4, 79};
        int[] minMax = getMinMax(arr);
        System.out.println("Min number in the array is " + minMax[0]);
        System.out.println("Max number in the array is " + minMax[1]);

    }

}
