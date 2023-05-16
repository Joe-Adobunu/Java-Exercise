package codeworld;

import java.util.Scanner;

public class Loops2 {
    public static void main(String[] args) {
        int sum = 0;
        int score;
        Scanner userInput = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {

                System.out.println("Enter a score");
                 score = userInput.nextInt();
            if (score >= 0 && score <= 100 )
                sum = sum + i ;
            }
            System.out.println("user total score " + sum);


        }
    }



