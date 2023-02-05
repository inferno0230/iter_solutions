package Sems1.Assignment_5;
/* Write a program to calculate and display the factorial of all numbers between m and n (where m < n, m
> 0, n > 0)
Sample run:
Enter the value of m: 2
Enter the value of n: 5
Factorial of 2 is: 2
Factorial of 3 is: 6
Factorial of 4 is: 24
Factorial of 5 is: 120 */

import java.util.Scanner;

public class q4 {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.print("Enter the value of m: ");
    int m = scan.nextInt();
    System.out.print("Enter the value of n: ");
    int n = scan.nextInt();
    scan.close();

    if (m>n||m<0||n<=0){
        System.out.println("Invalid input");
    } else {
        for (int i = m; i <= n; i++) {
            int factorial = 1;
            for (int j = 1; j <= i; j++) {
              factorial *= j;
            }
            System.out.println("Factorial of " + i + " is: " + factorial);
          }
    }
  }
}
