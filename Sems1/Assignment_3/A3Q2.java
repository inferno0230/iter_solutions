package Sems1.Assignment_3;
/* Alice visited SUM hospital to get treatment for her fever and illness. Doctor advised
her to drink at least 5000 ml of water each day. Alice drank x ml of water today. Write
a program that print the following message depending on the value of x.
“Yes, Alice is following doctor’s advice”
OR
“No, Alice is not following doctor’s advice” */

import java.util.Scanner;
public class A3Q2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the amount of water Alice drank today (in ml): ");
        int input = scan.nextInt();
        if (input >= 5000) {
            System.out.println("Yes, Alice is following doctor's advice");
        } else {
            System.out.println("No, Alice is not following doctor's advice");
        }
        scan.close();
    }
}