package Sems1.Assignment_2.Home_assignment;
/*
If you have N eggs, then you have N/12 dozen eggs, with N%12 eggs left over. (This is
essentially the definition of the / and % operators for integers.) Write a java program that asks
the user how many eggs she has and then tells the user how many dozen eggs she has and how
many extra eggs are left over. A gross of eggs is equal to 144 eggs. Extend your program so
that it will tell the user how many gross, how many dozen, and how many left over eggs she
has. For example, if the user says that she has 1342 eggs, and then your program would respond
with Your number of eggs is 9 gross, 3 dozen, and 10.
 */

import java.util.Scanner;
public class q2 {
    public static void main(String[]Args){
        int num,dozen,left_over;
        Scanner inp = new Scanner(System.in);
        System.out.print("Enter number of eggs you have: ");
        num = inp.nextInt();
        dozen = num/12;
        left_over = num%12;
        System.out.println("You have "+dozen+ " dozen eggs and "+left_over+ " eggs left over.");
        if (num>=144){
            int gross;
            gross = num/144;
            System.out.println("You also have "+gross+" gross of eggs");
        } else {};
        inp.close();
    }    
}
