package codeworld;
import java.util.Scanner;

public class PositiveNegativeZeroNumbers {
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);

            int positiveCount = 0;
            int negativeCount = 0;
            int zeroCount = 0;

            boolean numbers = true;

            while (numbers) {
                System.out.print("Enter a integer: ");
                System.out.print("enter 'Exit' to end: ");

                if (input.hasNextInt()) {
                    int number = input.nextInt();

                    if (number > 0) {
                        positiveCount++;
                    } else if (number < 0) {
                        negativeCount++;
                    } else {
                        zeroCount++;
                    }
                } else {
                    String userInput = input.next();

                    if (userInput.equals("Exit")) {
                        numbers = false;
                    } else {
                        System.out.println("Invalid input. Please enter a number or 'stop'.");
                    }
                }
            }

            System.out.println("Positive count: " + positiveCount);
            System.out.println("Negative count: " + negativeCount);
            System.out.println("Zero count: " + zeroCount);
        }


}
