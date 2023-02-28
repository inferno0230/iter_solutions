package Sems1.Assignment_3.Home_assignment;/* Write a java program that prompts the user to enter an integer and determines whether
it is divisible by 5 and 6, whether it is divisible by 5 or 6, and whether it is divisible
by 5 or 6, but not both.
Here is a sample run of this program:
Enter an integer: 10
Is 10 divisible by 5 and 6? false
Is 10 divisible by 5 or 6? true
Is 10 divisible by 5 or 6, but not both? True */

import java.util.Scanner;

public class A3HQ4 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.print("Enter an integer: ");
    int num = input.nextInt();

    boolean five_and_six = (num % 5 == 0) && (num % 6 == 0);
    boolean five_or_six = (num % 5 == 0) || (num % 6 == 0);
    boolean only_five_or_six = (num % 5 == 0) ^ (num % 6 == 0);

    System.out.println("Is " + num + " divisible by 5 and 6? " + five_and_six);
    System.out.println("Is " + num + " divisible by 5 or 6? " + five_or_six);
    System.out.println("Is " + num + " divisible by 5 or 6, but not both? " + only_five_or_six);
    input.close();
  }
}
