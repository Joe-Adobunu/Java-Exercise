package codeworld;

public class MinimumNumberInArray {
    public static int getMinimumNum(int[] arr){
        int min = arr[0];
        for(int index = 1; index < arr.length; index++){
            if (arr[index] < min){
                min = arr[index];
            }
        }
        return min;
    }

    public static void main(String[] args) {
        int[] array = {8, 57, -2, 7, 26, 50, 60, 4, 79};
        int min = getMinimumNum(array);
        System.out.println("the Min number in the array is " + min);
    }
}
