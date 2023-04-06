package Sems1.Assignment_4;
/* Write a program that finds greatest common divisor (GCD) of two numbers using Euclid's
algorithm, which is an iterative computation based on the following observation: if y divides
x, the GCD of x and y is y; otherwise, the GCD of x and y is same as GCD of x % y and y.
Sample run:
Enter the first number: 56
Enter the second number: 98
GCD of 56 and 98 is 14. */

import java.util.Scanner;

public class A4Q4 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the first number: ");
    int x = sc.nextInt();
    System.out.print("Enter the second number: ");
    int y = sc.nextInt();
    
    int min = Math.min(x, y);
    int gcd = 0;
    for(int i=1;i<=min;i++){
      if(min!=0 && y%i==0 && x%i==0){
        gcd = i;
      }
    }

    System.out.println(gcd);
    sc.close();
  }
}

