package Sems2.Assignment_3;
import java.util.Scanner;

public class A3Q7 {

    private static int factorial(int a) {
        int fact = 1;
        if (a>=1) {
           fact=a*factorial(a-1);
        } else {
            return 1;
        }
        return fact;
    }

    private static int exponential(int base,int power) {
        int exp = 1;
        if (power>=1) {
            exp = base*exponential(base,power-1);
        } else {
            return 1;
        }
        return exp;
    }

    private static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        } else {
            return gcd(b, a % b);
        }
    }

    private static String binaryReturn(int a) {
        String binary = "";
        if (a>0) {
            binary = binaryReturn(a/2)+a%2;
        } else {
            return "";
        }
        return binary;
    }

    private static int product(int a,int b) {
        int product = 0;
        if (b>=1) {
            product = a+product(a,b-1);
        } else {
            return 0;
        }
        return product;
    }

    public static void main(String []args) {
        Scanner input = new Scanner(System.in);
        int choice = Integer.MAX_VALUE;
        while(choice!=0) {
            System.out.println("\nAvailable choices :-\n1. Determine the factorial of a number \n2. Determine XN for two numbers X, N\n3. Determine GCD of two number.\n4. Binary equivalent of a decimal number\n5. Product of two numbers.\n0. Exit program\nEnter your choice: ");
            choice = input.nextInt();
            switch(choice){
                case 1:
                    System.out.print("Enter the a number to find its factorial: ");
                    int factNumber = input.nextInt();
                    System.out.println("Factorial of "+factNumber+" is: "+factorial(factNumber));
                    break;
                
                case 2:
                    System.out.println("Enter the first number: ");
                    int expX = input.nextInt();
                    System.out.println("Enter the second number: ");
                    int expY = input.nextInt();
                    System.out.println("Exponential of "+expX+" to the power "+expY+" is: "+exponential(expX,expY));
                    break;

                case 3: 
                    System.out.print("Enter the first number: ");
                    int gcdX = input.nextInt();
                    System.out.println("Enter the second number: ");
                    int gcdY = input.nextInt();
                    System.out.println("GCD of "+gcdX+" and "+gcdY+" is: "+gcd(gcdX,gcdY));
                    break;

                case 4:
                    System.out.print("Enter the number to find its binary equivalent: ");
                    int binaryNumber = input.nextInt();
                    System.out.println("Binary equivalent of "+binaryNumber+" is: "+binaryReturn(binaryNumber));
                    break;

                case 5:
                    System.out.print("Enter the first number: ");
                    int productX = input.nextInt();
                    System.out.println("Enter the second number: ");
                    int productY = input.nextInt();
                    System.out.println("Product of "+productX+" and "+productY+" is: "+product(productX,productY));
                    break;

                case 0:
                    System.out.println("Exiting program...");
                    break;

            }   
        }
    }
}