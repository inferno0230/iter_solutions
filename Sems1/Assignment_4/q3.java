package Sems1.Assignment_4;
/* Write a java program that takes an integer N from user, uses
Math. Random () to print N random integer numbers between 1 to N, and then prints their
average value. Use do while loop.
Sample run:
Enter a number: 6
Random numbers generated are: 6 4 5 2 2 5
Average of 6 random numbers are 4 */

import java.util.Scanner;
public class q3 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter a number: ");
    int n = sc.nextInt();
    int sum = 0;
    int count = 0;
    System.out.print("Random numbers generated are: ");
    do {
      int randomNum = (int) (Math.random() * n + 1);
      System.out.print(randomNum + " ");
      sum += randomNum;
      count++;
    } while (count < n);
    System.out.println();
    double average = (double) sum / n;
    System.out.println("Average of " + n + " random numbers is " + average);
  }
}
