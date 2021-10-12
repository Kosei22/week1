package week1.whileloops;

import java.util.Scanner;

public class AddingValuesInLoop {
    public static void main(String[] args) {
        int num = 0;
        int sum = 0;
        System.out.println("I will add up the numbers you give me.");
        Scanner guessNumber = new Scanner(System.in);
        System.out.print("Number: ");
        num = guessNumber.nextInt();
        while (num != 0) {
            sum = sum + num;
            System.out.println("The total so far is " + sum);
            System.out.print("Number: ");
            num = guessNumber.nextInt();
        }
        System.out.println("The total is" + sum);
    }
}
