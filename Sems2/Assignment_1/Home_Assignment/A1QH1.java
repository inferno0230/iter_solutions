package Sems2.Assignment_1.Home_Assignment;

import java.util.Scanner;
public class A1QH1 {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter three numbers: ");
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();
        input.close();
        if(a+b==c && a == b - c || a*b==c){
            System.out.println(a+","+","+"c"+" can be used in correct arithmetic formula");
        } else {
            System.out.println(a+","+","+"c"+" cannot be used in correct arithmetic formula");
        }
    }
}
