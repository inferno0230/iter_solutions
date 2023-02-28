package Sems1.Assignment_6;


import java.util.Scanner;

public class A6Q8 {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a word: ");
        String in = input.nextLine();
        input.close();
        System.out.println(isPalindrome(in));

    }

    public static boolean isPalindrome(String x){
        boolean check = false;
        String rev = "";
        char a[] = x.toCharArray();
        for (int i=(a.length-1);i>=0;i--){
            rev += a[i] + "";
        }
        
        rev = rev.trim();
        if(rev.equals(x)){
            check = true;
        }
        return check;
    }
}
