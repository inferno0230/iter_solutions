
import java.util.Scanner;
public class A6Q3 {
    public static void main(String[]Args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number to check: ");
        int n = input.nextInt();
        input.close();

        System.out.println("Reverse of "+n+" is "+reverse(n));
        System.out.println("Number "+n+" is palindrome: "+isPalindrome(n));

    }
    
    // Return the reversal of an integer. Example: reverse (456), returns 654
    public static int reverse(int number){
        int reverse=0,remainder;
        for(;number!=0;){
            remainder=number%10;
            reverse+=remainder;
            reverse*=10;
            number/=10;
        }
        return (reverse/10);
    }

    // Return true if number is a palindrome 
    public static boolean isPalindrome(int number){
        boolean check = false;
        if(reverse(number)==number){
        check = true;
        }
        return check;
    }
}
