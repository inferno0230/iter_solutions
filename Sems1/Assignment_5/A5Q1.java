package Sems1.Assignment_5;
/* Amicable numbers are pair of numbers each of whose divisors are added to give the other
number.
Example: The smallest pair of amicable numbers is (220, 284).
They are amicable because the proper divisors of 220 are 1, 2, 4, 5, 10, 11, 20, 22, 44, 55 and
110, of which the sum is 284; and the proper divisors of 284 are 1, 2, 4, 71 and 142, of which
the sum is 220.
Note: 1 is included as a divisor but the numbers are not included as their own divisors.
Write a java program that tests whether a given pair of numbers is amicable numbers or not.
Sample run 1:
Enter first number: 220
Enter second number: 284
220 and 284 are amicable numbers.
Sample run 2:
Enter first number: 220
Enter second number: 230
220 and 230 are not amicable numbers.*/

import java.util.Scanner;

public class A5Q1 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Enter first number: ");
    int n1 = input.nextInt();
    System.out.print("Enter second number: ");
    int n2 = input.nextInt();
    input.close();
    int sum_1 = 0, sum_2 = 0;
    for (int i = 1; i < n1; i++) {
      if (n1 % i == 0) {
        sum_1 += i;
      }
    }

    for (int i = 1; i < n2; i++) {
      if (n2 % i == 0) {
        sum_2 += i;
      }
    }

    if (sum_1 == n2 && sum_2 == n1) {
      System.out.println(n1 + " and " + n2 + " are amicable numbers");
    } else {
      System.out.println(n1 + " and " + n2 + " are not amicable numbers");
    }
  }
}