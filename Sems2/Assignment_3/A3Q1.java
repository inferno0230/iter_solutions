package Sems2.Assignment_3;
import java.util.Scanner;

public class A3Q1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your lucky number: ");
        int n = input.nextInt();
        input.close();
        try {
            if (n < 0) {
                throw new NumberFormatException();
            } else {
                System.out.print("Your lucky number is "+n);
            }
        } catch (NumberFormatException e) {
            System.out.print(e+": Negative number");
        }
    }
}

