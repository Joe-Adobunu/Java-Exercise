package codeworld;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayPractice {
    public static void main(String[] args) {

//        int[] numbers, ages;
//        number = new int[3];
//        age = new int [4];
//        int [] numbers = new int [5];
//        int [] figures = {1, 2, 3, 4 };
//          String [] names = new String[]
//                  {"esther", "kulitech", "vicky", "retna", "onye", "joy", "sultan", "bright" };
//        System.out.println(names[0]);
//        System.out.println(names.length);
//        System.out.println(names[names.length - 1]);
//
//        int[] count = new int [5];
//
//        count[0] = 3;
//        count[1] = 4;
//        count[2] = 5;
//        count[3] = 6;
//        count[4] = 7;
//        System.out.println(Arrays.toString(count));
        Scanner scanner = new Scanner(System.in);

        int sum = 0;
        int[] array= new int[5];
        for (int i = 0; i < array.length; i++) {
            System.out.println("enter a number");
            array[i]= scanner.nextInt();
            //array[i] += 1;
        }
        for(int i = 0; i < array.length; i++){
            sum += array[i];
        }
        System.out.println(sum);


    }


}
