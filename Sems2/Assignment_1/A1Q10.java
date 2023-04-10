package Sems2.Assignment_1;

import java.util.Scanner;
public class A1Q10 {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a 3-by-4 matrix row by row: ");
        double m[][] = new double[3][4];
        for(int i=0;i<3;i++){
            for(int j=0;j<4;j++){
                m[i][j]=input.nextDouble();
            }
        }
        input.close();

        //Display array
        for(double x[]:m){
            for(double y:x){
                System.out.print(y+"\t");
            }
            System.out.println();
        }

        for(int i=0;i<4;i++){
            System.out.println("Sum of the elements at column "+i+" is "+sumColumn(m, i));
        }
    }

    public static double sumColumn(double m[][], int columnIndex){
        double sum = 0;
        for(int i=0;i<3;i++){
            sum+=m[i][columnIndex];
        }

        return sum;
    }
}
