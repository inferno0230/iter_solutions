/* An integer n is divisible by 9 if the sum of its digits is divisible by 9. Use this concept in your
program to determine whether or not the number is divisible by 9. Test it on the following
numbers: Use while loop.
n = 123456
n = 154368
n = 621594
Hint: Use the % operator to get each digit; then use / operator to remove the digit.
Sample run 1:
Enter a number: 154368
The number 154368 is divisible by 9.
Sample run 2:
Enter a number: 123456
The number 123456 is not divisible by 9. */

import java.util.Scanner;
public class A4Q2 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.print("Enter a number: ");
    int num = input.nextInt();

    int sum = 0;
    while (num > 0) {
      sum += num % 10;
      num /= 10;
    }

    if (sum % 9 == 0) {
      System.out.println(num + " is divisible by 9");
    } else {
      System.out.println(num + " is not divisible by 9");
    }
    input.close();
  }
}

