package Sems1.Assignment_6;


import java.util.Scanner;

public class q8 {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a word: ");
        String in = input.nextLine();
        input.close();
        System.out.println(isPalindrome(in));

    }

    public static boolean isPalindrome(String x){
        boolean check = false;
        char a[] = x.toCharArray();
        StringBuilder temp = new StringBuilder();
        for (int i = x.length()-1;i >= 0;i--){
            temp.append(a[i]);
        }
        String string = temp.toString();
        System.out.print(string);

        for (int i = 0;i<x.length();i++){
            if (x.charAt(i)==string.charAt(i)){
                check = true;
            }
        }
        return check;
    }
}
