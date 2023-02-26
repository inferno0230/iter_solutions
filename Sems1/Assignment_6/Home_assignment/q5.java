package Sems1.Assignment_6.Home_assignment;

import java.util.Scanner;
public class q5 {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter 3 number: ");
        int x = input.nextInt();
        int y = input.nextInt();
        int z = input.nextInt();
        input.close();

        System.out.println(check(x, y, z));
    }

    public static boolean check(int a,int b,int c){
        boolean cons = false;
        if (a==(b-1)&&a==(c-2)){
            cons = true;
            return cons;
        } else {
            return cons;
        }
    }
}
