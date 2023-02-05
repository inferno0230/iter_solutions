package Sems1.Assignment_5;
/* Write a program to check whether a number is twisted prime or not. Twisted prime is a number if the
number and its reverse both are prime then it is called twisted prime.
Sample run 1:
Enter a number: 97
97 is twisted prime.
Sample run 2: 43
43 is not a twisted prime */

import java.util.Scanner;

public class q2 {
    public static void main(String[] Args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = input.nextInt();
        input.close();

        if (num == 1 || num == 0) {
            System.out.println(num + " is not a prime number");
        } else if (num % 2 == 0) {
            System.out.println(num + " is not a prime number");
        } else {
            for (int i = 3; i <= (num / 2); i += 2) {
                if (num % i == 0) {
                    System.out.println(num + " is not a prime number");
                    return;
                }
            }
            int reverse = 0, num_2 = num;
            while (num > 0) {
                reverse = reverse * 10 + num % 10;
                num /= 10;
            }
            
            if (reverse == 1 || reverse == 0 || num_2 % 2 == 0) {
                System.out.println(num_2 + " is not a twisted prime");
            } else {
                for (int i = 3; i <= (reverse / 2); i += 2) {
                    if (reverse % i == 0) {
                        System.out.println(num_2 + " is not a twisted prime");
                        return;
                    }
                }
                System.out.println(num_2 + " is a twisted prime");
            }
        }
    }
}
