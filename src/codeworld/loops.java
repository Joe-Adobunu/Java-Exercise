package codeworld;
import java.util.Scanner;
public class loops {
    public static void main(String [] args) {
        int number = 0;
        int sum = 0;
        Scanner userInput = new Scanner(System.in);

        for (int i = 0; i < 5; i++) {
           System.out.println("Enter a score");
             number = userInput.nextInt();
            sum = sum + number;
        }
        System.out.println("user total score " + sum);


    }
}
