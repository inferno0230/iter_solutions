package Sems1.Assignment_6;

import java.util.Scanner;

public class A6Q9 {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a password: "); 
        String x = input.next();
        input.close();

        if (pass_check(x)==true){
            System.out.println("Password is valid");
        } else {
            System.out.println("Password is invalid");
        }

    }

    public static boolean pass_check(String x){
        boolean check=false,check_len=false,check_letter_digit=false,check_total_digit=false;
        char a[] = x.toCharArray();
        if(a.length >= 8){
            check_len = true;
        }

        for (int i=0;i<x.length();i++){
            if((x.charAt(i)>='a' && x.charAt(i)<='z') || (x.charAt(i)>='0' && x.charAt(i)<='9') || (x.charAt(i)>='A' && x.charAt(i)<='Z')){
                check_letter_digit = true;
            } else {
                check_letter_digit = false;
                break;
            }
        }

        int count=0;
        for (int i=0;i<x.length();i++){
            if(x.charAt(i)>='0' && x.charAt(i)<='9'){
                count++;
            }

        }
        if (count>=2){
            check_total_digit=true;
        }

        if(check_len == true && check_letter_digit == true && check_total_digit == true){
            check =true;
        }

        return check;

    }
}