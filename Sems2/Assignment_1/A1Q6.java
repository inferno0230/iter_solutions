package Sems2.Assignment_1;
/* Write a Java method, isOdd( ), that takes an int i and returns true if and only if i is odd. Your
method can't use the multiplication, modulus, or division operators, The method signature is
as follows.
public static boolean isOdd(int n)
Sample Run:
Enter a number 37
37 is odd: true */

import java.util.Scanner;
public class A1Q6 {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = input.nextInt();
        input.close();

        System.out.println(n+" is odd: "+isOdd(n));

    }

    public static boolean isOdd(int n){
        boolean check = false;
        if(n%2!=0){
            check = true;
        }
        return check;
    }
}
