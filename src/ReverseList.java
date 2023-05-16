import java.util.Arrays;

public class ReverseList {
    public static void reverseArray(int[] array){
        int end = array.length -1;
        for(int start = 0; start < end; start++, end--){
            int element = array[start];
            array[start] = array[end];
            array[end] = element;

        }
    }

    public static void main(String[] args) {
        int[] arr = {2, 7, 89, 3, 0, 100};
        System.out.println("Array Elements " + Arrays.toString(arr));
        reverseArray(arr);
        System.out.println("Reverse Array Element " + Arrays.toString(arr));
    }
}
