package codeworld;

import java.util.Scanner;

public class Loops3 {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        int sum = 0;
        int average=0;
        for (int i = 1; i <= 5; i++) {

            System.out.println("Enter a score");
            int score = userInput.nextInt();
            if (score >= 0 && score <= 100 ){
                sum = sum + score ;
                average++;
            }
        }
        System.out.println("user total score " + sum);
        System.out.println(sum/average);


    }
}

