package Sems2.Assignment_1;

import java.util.Scanner;
public class A1Q9 {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a 4-by-4 matrix row by row: ");
        int arr[][] = new int [4][4];
        for(int i=0;i<4;i++){
            for(int j=0;j<4;j++){
                arr[i][j]=input.nextInt();
            }
        }
        input.close();

        // Display array
        for(int X[]:arr){
            for (int Y:X){
                System.out.print(Y+"\t");
            }
            System.out.println();
        }
        
        // Display sum of diagonals of array
        int sum = 0;
        for(int i=0;i<4;i++){
            for(int j=i;j==i;j++){
                sum+=arr[i][j];
            }
        }
        System.out.println("Sum of the elements in the major diagonal is "+sum);
        
    }
}
