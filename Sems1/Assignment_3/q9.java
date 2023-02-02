package Sems1.Assignment_3;
/* Write a program to input 3 integer number a, b, c. Find the largest number among 3.
Also find the 2nd largest number among 3. Here is the sample output:
Enter the value of a, b, c:10 30 50
Largest number: 50
2nd largest number: 30 */

import java.util.Scanner;

public class q9 {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.print("Enter the value of a, b, c: ");
    int a = scan.nextInt();
    int b = scan.nextInt();
    int c = scan.nextInt();

    int largest = a;
    if (b > largest) {
      largest = b;
    }
    if (c > largest) {
      largest = c;
    }

    int secondLargest;
    if (a == largest) {
      secondLargest = Math.max(b, c);
    } else if (b == largest) {
      secondLargest = Math.max(a, c);
    } else {
      secondLargest = Math.max(a, b);
    }

    System.out.println("Largest number: " + largest);
    System.out.println("2nd largest number: " + secondLargest);
  }
}
