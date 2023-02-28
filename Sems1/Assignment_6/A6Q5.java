package Sems1.Assignment_6;

import java.util.Scanner;
public class A6Q5 {

    public static void main(String[]Args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the value for n: ");
        int n = input.nextInt();
        System.out.print("Enter the length of side: ");
        double side = input.nextDouble();
        input.close();

        System.out.println("Area of the given cylinder is "+area(n,side));
    }

    public static double area(int n, double side){
        double area = (n*Math.pow(side,2))/(4*Math.tan(Math.PI/n));
        return area;
    }

    
}