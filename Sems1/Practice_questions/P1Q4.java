package Sems1.Practice_questions;

import java.util.Scanner;
public class P1Q4 {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        double a[] = new double[10];
        for (int i=0;i<a.length;i++){
            System.out.println("Enter ten numbers: ");
            a[i] = input.nextDouble();
        }
        input.close();

        System.out.print("The minimum number is: "+min(a));


    }

    public static double min(double[] array){
        double min = array[0];
        for (int i=0;i<array.length;i++){
            for(int j=0;j<array.length;j++){
                if(min>array[j]){
                    min = array[j];
                }
            }

        }
        return min;
    }
}
