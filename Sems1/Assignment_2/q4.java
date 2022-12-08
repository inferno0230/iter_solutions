package Sems1.Assignment_2;
/*
Write a java program that reads an integer between 0 and 1000 and adds all the digits in the
integer. For example, if an integer is 749, the sum of all its digits is 20.
    Hint: Use the % operator to extract digits, and use the /
    operator to remove the extracted digit.
    For instance, 749 % 10 = 9 and 749 / 10 = 74.
    Here is a sample run:
    Enter a number between 0 and 1000: 999 The sum of the
    digits is 27
 */
import java.util.Scanner;

public class q4 {
	public static void main(String[] args){
        int sum;
		Scanner sc = new Scanner(System.in);		// Create new Scanner object

		// Prompt the user to enter a number between 0 and 1000.
		System.out.print("Enter a number between 0 and 1000: ");
		int number = sc.nextInt();
        if(number>=0 && number<=1000){
		int lessThan10 = number % 10;		
		number /= 10;						
		int tens = number % 10;			
		number /= 10;					
		int hundreds = number % 10;		
		number /= 10;
		sum = hundreds + tens + lessThan10;	
        System.out.println("The sum of the digits is " + sum);
        } else {
            System.out.println("Invalid input");
        }
	}
}