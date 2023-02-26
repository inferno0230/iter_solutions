package Sems1.Assignment_6.Home_assignment;

import java.util.Scanner;
public class q3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a word: ");
        String in = input.nextLine();
        input.close();

        System.out.println(check(in));
    }

    public static Character check(String a){
        if (a.length()%2==0){
            return a.charAt((a.length()-1)/2+1);
        } else {
            return a.charAt((a.length()-1)/2);
        }
    }

    
}