package Sems1.Assignment_4;
/* Write a java program to take an integer input from the user and print the input by removing all
zeros.
Example: Input = 10200 then Output = 12.
Sample run:
Enter an integer number: 10203040
After removing 0 from number 10203040, the new number is 1234. */

import java.util.Scanner;
public class A4Q9 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an integer number: ");
        int number = input.nextInt();
        String str = "";
        while (number > 0) {
            int digit = number % 10;
            if (digit != 0) {
                str = digit + str;
            }
            number /= 10;
        }
        System.out.println("After removing 0 from number " + number + ", the new number is " + str);
        input.close();
    }
}
