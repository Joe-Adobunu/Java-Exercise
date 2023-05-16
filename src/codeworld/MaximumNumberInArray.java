package codeworld;

public class MaximumNumberInArray {
    public static int getMaxNum(int[] arr) {
        int max = arr[0];


        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        return max;
    }

    public static void main(String[] args) {
        int[] arr = {8, 57, 100, 7, 26, 50, 60, 4, 79};
        int max = getMaxNum(arr);
        System.out.println("The max number in the array is " + max);
    }


}
