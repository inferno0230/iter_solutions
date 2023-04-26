package Sems2.Assignment_1;
/* Write a java method to calculate the sum of digits of a given number until the number is a
single digit. The method signature is as follows.
public static int sum_Of_Digits(int n)
Example:
Let n = 9294
Sum = 9 + 2 + 9 + 4 = 24
Sum = 2 + 4 = 6
Sample Run:
Enter a number 9294
Sum of digits of 9294 until the number is a single digit is 6 */

import java.util.Scanner;
public class A1Q5 {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = input.nextInt();
        input.close();

        while(n>10){
            n = sum_Of_Digits(n);
        }

        System.out.print("Sum of digits of "+n+" until the number is a single digit is "+n);

    }

    public static int sum_Of_Digits(int n){
        int sum = 0;
        while(n>0){
            sum += n%10;
            n/=10;
        }
        return sum;
    }
}
