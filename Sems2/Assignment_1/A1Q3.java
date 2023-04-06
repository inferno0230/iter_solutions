package Sems2.Assignment_1;
/* Write a java program to check whether a number is a spy number or not.
Example:
N = 132
Sum of digit of N = 1 + 3 + 2 = 6
Product of digit of N = 1 × 3 × 2 = 6
So, 132 is a spy number.
Sample Run:
Enter a number: 1124
1124 is a spy number. */

import java.util.Scanner;
public class A1Q3 {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = input.nextInt();
        input.close();
        

        if(sum(rev(n))==product(rev(n))){
            System.out.println(n+" is a spy number.");
        }
    }

    public static int sum(int x){
        int sum = 0;
        while(x>0){
            sum += x%10;
            x/=10;
        }
        return sum;
    }

    public static int product(int x){
        int product = 1;
        while(x!=0){
            product *= x%10;
            x/=10;
        }
        return product;
    }

    public static int rev(int x){
        int rev = 0;
        while(x>0){
            rev += x%10;
            rev*=10;
            x/=10;
        }
        return rev/10;
    }
}
