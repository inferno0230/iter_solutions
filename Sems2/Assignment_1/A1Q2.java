package Sems2.Assignment_1;

import java.util.Scanner;
public class A1Q2 {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter person Weight in kg: ");
        double weight = input.nextFloat();
        System.out.print("Enter height of person in meter: ");
        double height = input.nextFloat();
        input.close();
        bmi(weight,height);
    }

    private static void bmi(double x,double y){
        double bmi = x/(y*y);
        if (bmi<18.5){
            System.out.println("The person is Underweight.");
        } else if (bmi>=18.5 && bmi<=24.9){
            System.out.println("The person is Normal Weight.");
        } else if (bmi>=25.0 && bmi<=29.9){
            System.out.println("The person is Overweight.");
        } else {
            System.out.println("The person is Obese.");
        }
    }
}
