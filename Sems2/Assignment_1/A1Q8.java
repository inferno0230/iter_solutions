package Sems2.Assignment_1;

import java.util.Scanner;
public class A1Q8 {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number of Row and Columns of 2D-Array: ");
        int M[][] = new int[input.nextInt()][input.nextInt()];
        System.out.println("Enter elements of matrix");
        // Input elements of array
        for(int i=0;i<3;i++){
            for (int j=0;j<3;j++){
                M[i][j]=input.nextInt();
            }
        }
        input.close();

        //Display array
        System.out.println("The elements of 2D array are: ");
        for(int X[]:M){
            for(int Y:X){
                System.out.print(Y+"\t");
            }
            System.out.println();
        }

        int sum = 0;
        for (int X[]:M){
            for(int Y:X){
                sum+=Y;
            }
        }
        System.out.println("The sum of elements of the 2D-Array is "+sum);
        

    }
}
