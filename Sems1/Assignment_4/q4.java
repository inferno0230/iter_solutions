package Sems1.Assignment_4;
/* Write a program that finds greatest common divisor (GCD) of two numbers using Euclid's
algorithm, which is an iterative computation based on the following observation: if y divides
x, the GCD of x and y is y; otherwise, the GCD of x and y is same as GCD of x % y and y.
Sample run:
Enter the first number: 56
Enter the second number: 98
GCD of 56 and 98 is 14. */

import java.util.Scanner;

public class q4 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the first number: ");
    int x = sc.nextInt();
    System.out.print("Enter the second number: ");
    int y = sc.nextInt();
    while (y != 0) {
      int remainder = x % y;
      x = y;
      y = remainder;
    }
    System.out.println("GCD of " + x + " and " + y + " is " + x + ".");
    sc.close();
  }
}

