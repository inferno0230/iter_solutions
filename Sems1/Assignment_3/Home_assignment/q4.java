package Sems1.Assignment_3;
/* Write a java program that prompts the user to enter an integer and determines whether
it is divisible by 5 and 6, whether it is divisible by 5 or 6, and whether it is divisible
by 5 or 6, but not both.
Here is a sample run of this program:
Enter an integer: 10
Is 10 divisible by 5 and 6? false
Is 10 divisible by 5 or 6? true
Is 10 divisible by 5 or 6, but not both? True */

import java.util.Scanner;

public class q4 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.print("Enter an integer: ");
    int num = input.nextInt();

    boolean 5_and_6 = (num % 5 == 0) && (num % 6 == 0);
    boolean 5_or_6 = (num % 5 == 0) || (num % 6 == 0);
    boolean only_5_or_6 = (num % 5 == 0) ^ (num % 6 == 0);

    System.out.println("Is " + num + " divisible by 5 and 6? " + 5_and_6);
    System.out.println("Is " + num + " divisible by 5 or 6? " + 5_or_6);
    System.out.println("Is " + num + " divisible by 5 or 6, but not both? " + only_5_or_6);
  }
}
