package codeworld;

import java.util.Scanner;

public class PhoneMenu2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter A number");
        int userInput = input.nextInt();

        for (int i = 1; i <= userInput; i++) {

           System.out.println(i +"  " +i * i);
        }

    }

}
