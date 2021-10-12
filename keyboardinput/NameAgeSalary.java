package week1.keyboardinput;

import java.util.Scanner;

public class NameAgeSalary {
    public static void main(String[] args) {
        Scanner inputName = new Scanner(System.in);
        System.out.println("Hello. What is your name?");
        String name = inputName.nextLine();
        Scanner inputAge = new Scanner(System.in);
        System.out.println("Hi!, " + name + "!  How old are you?");
        String age = inputAge.nextLine();
        Scanner inputSalary = new Scanner(System.in);
        System.out.println("So you're " + age + " eh? That's not old at all!!\nHow much do you make, " + name + "?");
        String salary = inputSalary.nextLine();
        System.out.println(salary + "!!  I hope that's per hour and not per year! LOL!");

    }
}
