package codeworld;

import java.util.Scanner;

public class Classwwrk {
    public static void main(String[] args) {
//        for(int i = 0; i < 10; i++){
//            System.out.println("i love you");
//        }
//        for (int i = 0; i < 100; i++){
//            System.out.println("i love me");
//        }
        Scanner userInput = new Scanner(System.in);
        System.out.println("enter a number");
        int number = userInput.nextInt();
        int num = 1;
        for(int i = 0; i < 5; i++){
             num = number * num;
            System.out.println(num);
        }

    }
}
