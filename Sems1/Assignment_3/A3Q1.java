package Sems1.Assignment_3;
/* Write a program to input the age of a person and check if the age of the person is
greater than or equal to 18 then print the message:

“You are eligible to cast your vote”. */

import java.util.Scanner;
public class A3Q1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter your age: ");
        int age = scan.nextInt();
        if (age >= 18) {
            System.out.println("You are eligible to cast your vote");
        } else {
            System.out.println("You are not eligible to cast your vote");
        }
        scan.close();
    }
}