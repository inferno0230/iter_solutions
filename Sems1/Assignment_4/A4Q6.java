package Sems1.Assignment_4;
/* Write a java program to enter two numbers through the keyboard. Write a program to find the
value of one number raised to the power of another. (Do not use Java built-in method).
Sample run:
Enter the base: 5
Enter the power: 4
5 to the power 4 is: 625 */

import java.util.Scanner;
public class A4Q6 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the base: ");
    int base = sc.nextInt();
    System.out.print("Enter the power: ");
    int power = sc.nextInt();
    int result = 1;
    for (int i = 0; i < power; i++) {
      result *= base;
    }
    System.out.println(base + " to the power " + power + " is: " + result);
    sc.close();
  }
}
