package Sems2.Assignment_3;
import java.util.Scanner;

public class A3Q9 {
    private static int fibonacci(int n) {
        if (n<=1) {
            return n;
        } else {
            return fibonacci(n-1)+fibonacci(n-2);
        }
    }
    public static void main(String []args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = input.nextInt();
        System.out.println("The "+num+"th Fibonacci number is "+fibonacci(num));
    }
}
