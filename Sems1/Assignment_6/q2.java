package Sems1.Assignment_6;

import java.util.Scanner;
public class q2 {
    public static void main(String[]Args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter value of n: ");
        int n = input.nextInt();
        input.close();

        System.out.print("Pentagonal number upto "+n+" are: ");
        for (int i=1;i<=n;i++){
            System.out.print(getPentagonalNumber(i)+" ");
        }
    }

    public static int getPentagonalNumber(int n){
        double x=0;
        x = (n*(3*n-1)/2);
        return (int)x;
    }
    
}
