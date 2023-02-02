package Sems1.Assignment_3;
/* Write a Java program that takes a year from user and print true if that year is a leap year
otherwise print false.
Here is a sample run:
Input the year: 2016
2016 is a leap year: true
Input the year: 2008
2008 is a leap0 year: false
Input the year: 1900
1900 is a leap year: false */

import java.util.Scanner;
public class q5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Input the year: ");
        int year = scan.nextInt();
        boolean leap = false;
        if (year % 4 == 0) {
            if (year % 100 == 0) {
            if (year % 400 == 0) {
                leap = true;
            } else {
                leap = false;
            }
            } else {
                leap = true;
            }
        } else {
        leap = false;
        }
        System.out.println(year + " is a leap year: " + leap);
        scan.close();
    }
}