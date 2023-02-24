package Sems1.Assignment_6;

import java.util.Scanner;

public class q9 {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a password: "); 
        String x = input.next();
        input.close();

        System.out.println(pass_check(x));

    }

    public static boolean pass_check(String x){
        boolean check=false,check_len=false,check_letter_digit=false,check_total_digit=false;
        char a[] = x.toCharArray();
        if(a.length >= 8){
            check_len = true;
            System.out.println("check_len "+check_len);
        }

        for (int i=0;i<x.length();i++){
            if((x.charAt(i)>='a' && x.charAt(i)<='z') || (x.charAt(i)>='0' && x.charAt(i)<='9') || (x.charAt(i)>='A' && x.charAt(i)<='Z')){
                check_letter_digit = true;
                System.out.println("check_letter_digit "+check_letter_digit);
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
            System.out.println("check_total_digit "+check_total_digit);
        }

        if(check_len == true && check_letter_digit == true && check_total_digit == true){
            check =true;
            System.out.println("check "+check);
        }

        return check;

    }
}
