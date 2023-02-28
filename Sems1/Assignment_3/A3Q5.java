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
public class A3Q5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Input the year: ");
        int year = scan.nextInt();
        boolean leap = false;
        if (year%4==0 && year%100!=0){
            leap = true;
        } else if (year%400==0){
            leap = true;
        }
        System.out.println(year + " is a leap year: " + leap);
        scan.close();
    }
}