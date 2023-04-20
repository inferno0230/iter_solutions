package Sems2.Assignment_1.Home_Assignment;

import java.util.Scanner;
public class A1QH2 {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        System.out.print("Emter three lines: ");
        String x[] = new String[3];
        x[0]=input.nextLine();
        x[1]=input.nextLine();
        x[2]=input.nextLine();
        input.close();
        System.out.println("\nReversed order: \n");
        for(int i=x.length-1;i>=0;i--){
            System.out.println(x[i]+"");
        }


    }

}

