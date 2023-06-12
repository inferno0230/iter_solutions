package Sems2.Assignment_3.Home_assignment;
/* Write  a  recursive  Java  method  that  determines  if  a  string  s  is  a  palindrome,  that  is,  it  is 
equal to its reverse.  
Examples of palindromes include 'racecar' and 'gohangasalamiimalasagnahog'. */

import java.util.Scanner;

public class A3HQ3 {
    static boolean isPalindrome(String s) {
        if (s.length() == 0 || s.length() == 1) {
            return true;
        }
        if (s.charAt(0) == s.charAt(s.length() - 1)) {
            return isPalindrome(s.substring(1, s.length() - 1));
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter string: ");
        String s = input.next();
        input.close();
        if (isPalindrome(s)) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not Palindrome");
        }
    }
}
