package Sems1.Assignment_6.Home_assignment;

import java.util.Scanner;
public class A6HQ4 {
    public static void main(String[]Args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String in = input.nextLine();
        input.close();

        check(in);
    }

    public static void check(String in){
        String a[] = in.split(" ");

        System.out.print("Total number of words in the sentence is "+a.length);

    }
}