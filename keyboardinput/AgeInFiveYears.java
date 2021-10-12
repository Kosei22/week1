package week1.keyboardinput;

import java.util.Scanner;

public class AgeInFiveYears {
    public static void main(String[] args) {
        Scanner inputName = new Scanner(System.in);
        System.out.println("Hello. What is your name?");
        String name = inputName.nextLine();
        Scanner inputAge = new Scanner(System.in);
        System.out.println("Hi!, " + name + "!  How old are you?");
        int age = inputAge.nextInt();
        int ageFuture = age + 5;
        int ageAgo = age - 5;
        System.out.println("Did you know that in five years you will be" + ageFuture + " years old?");
        System.out.println("And five years ago you were " + ageAgo + " ! Imagine that!");
    }
}
