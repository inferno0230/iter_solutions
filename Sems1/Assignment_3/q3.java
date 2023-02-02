package Sems1.Assignment_3;
/*Write a program that reads three integers from the user and prints "Increasing" if the
numbers are in increasing order, "Decreasing" if the numbers are in decreasing order,
and "Neither increasing nor decreasing order" otherwise.
Here is sample run:

Input first number: 241
Input second number:345
Input third number: 4563
“Increasing”

Input first number: 345
Input second number:145
Input third number: 563
“Neither Increasing nor decreasing”

Input first number: 45
Input second number:14
Input third number: 3
“Decreasing” */

import java.util.Scanner;
public class q3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Input first number: ");
        int first = scan.nextInt();
        System.out.print("Input second number: ");
        int second = scan.nextInt();
        System.out.print("Input third number: ");
        int third = scan.nextInt();
        if (first < second && second < third) {
            System.out.println("Increasing");
        } else if (first > second && second > third) {
            System.out.println("Decreasing");
        } else {
            System.out.println("Neither increasing nor decreasing order");
        }
        scan.close();
    }
}