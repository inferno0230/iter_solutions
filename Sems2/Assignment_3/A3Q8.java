package Sems2.Assignment_3;

import java.util.Scanner;
public class A3Q8 {
    private static int reverse(int a) {
        int rev = 0;
        if (a>0) {
            rev = reverse(a/10)*10+a%10;
        } else {
            return 0;
        }
        return rev;
    }
    public static void main(String []args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = input.nextInt();
        System.out.println("The reverse of "+num+" is "+reverse(num));
    }
}
