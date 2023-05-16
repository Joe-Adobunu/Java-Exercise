package codeworld;

public class ChangeVariable {
    public static void main(String[] args) {
//        int number = 10;
//        modify(number);
//        System.out.println(number);
        int[] numbers = {1, 2, 3, 4, 5};
        modify(numbers);
        System.out.println(numbers);
    }
    public static void modify(int[] arr){
//        num = 40;
//        System.out.println("from the modify method  " + num);
        for (int i = 0; i < arr.length; i++)
        arr[i] = arr[i] * arr [i];
//        System.out.println(m);
    }
}
