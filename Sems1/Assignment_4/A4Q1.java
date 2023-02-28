/* Write a java program that gets three integer numbers from the user. Count from the first number
to the second number increments by the third number. Use for loop to do it. Also, display the
sum of numbers displayed between the first number and second number.
Sample run:
Enter first number: 4
Enter second number: 13
Enter third number: 3
4 7 10 13
The sum of number displayed is 34 */

import java.util.Scanner;

public class A4Q1 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.print("Enter first number: ");
    int firstNum = input.nextInt();
    System.out.print("Enter second number: ");
    int secondNum = input.nextInt();
    System.out.print("Enter third number: ");
    int thirdNum = input.nextInt();

    int sum = 0;
    for (int i = firstNum; i <= secondNum; i += thirdNum) {
      System.out.print(i + " ");
      sum += i;
    }
    System.out.println();
    System.out.println("The sum of numbers displayed is " + sum);
    input.close();
  }
}
