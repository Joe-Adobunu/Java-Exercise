import java.util.Scanner;

public class PrimeNumbers {
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = input.nextInt();

        int sum = 1;
        for (int i = 1; i<=num/2; i++) {
            if (num % 2== 0)  sum += i;

            System.out.println(sum == 1? " is a Prime Number " : "Not a prime number ");
        }

        }
    }



