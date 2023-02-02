package Sems1.Assignment_4.Home_assignment;
/* Write a java program to print the sum of all even numbers and the product of all odd numbers
from 1 to N. Where, N is the input to the program.
For input, N = 10
Sum of all even numbers = 2 + 4 + 6 + 8 + 10 = 30
Product of all odd numbers = 1 * 3 * 5 * 7 * 9 = 945 */
import java.util.Scanner;
public class q4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter value of N: ");
		int input = sc.nextInt();
		int sum=0;
		double product=1;
		for(int i=1;i<=input;i++) {
			if (i%2==0) {
				sum += i;
			} if(i%2!=0) {
				product*=i;
			}
		}
		System.out.println("Sum of all even numbers b/w 1 to "+input+" is "+sum);
		System.out.println("Product of all odd number b/w 1 to "+input+" is "+(float)product);
		sc.close();
	}
}
