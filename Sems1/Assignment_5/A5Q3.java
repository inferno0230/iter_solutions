/*Write a program to enter the first number and second number. Display the prime numbers between the
first and second number.
Sample run:
Enter the first number: 4
Enter the second number: 15
Prime numbers between 4 and 15 are: 5
7
11
13 */

import java.util.Scanner;
public class A5Q3 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Enter first number: ");
    int num_1 = input.nextInt();
    System.out.print("Enter second number: ");
    int num_2 = input.nextInt();

    if (num_1>num_2){
        System.out.println("Invalid input");
    } else {
        System.out.print("Prime numbers between "+num_1+" and "+num_2+" are: ");
        for (int i = num_1; i <= num_2; i++) {
        boolean prime_check = true;
        for (int j = 2; j < i; j++) {
            if (i % j == 0) {
                prime_check = false;
                break;
            }
        }
        if (prime_check) {
            System.out.print(i+" ");
         }
        }
    }
    input.close();
    System.out.println();
  }
}

