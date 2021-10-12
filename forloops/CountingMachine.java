package week1.forloops;
import java.util.Scanner;
public class CountingMachine {
    public static void main(String[] args) {
        Scanner countInput = new Scanner(System.in);
        System.out.print("Count to: ");
        int count = countInput.nextInt();
        for (int i = 0; i < count + 1; i ++){
            System.out.print(i + " ");
        }
    }
}
