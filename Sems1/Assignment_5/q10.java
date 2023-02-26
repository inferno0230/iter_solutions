package Sems1.Assignment_5;

import java.util.Scanner;
public class q10 {
    public static void main(String[]Args){
        int a=0,b=1,c=1,d=0;
        Scanner input = new Scanner (System.in);
        System.out.println("Enter the value of n: ");
        int n = input.nextInt();
        input.close();
        System.out.print("The sequence is "+a+" "+b+" "+c+" ");
        for (int i = 3;i<n;i++){
            d=a+b+c;
            System.out.print(d+" ");
            a=b;
            b=c;
            c=d;
        }
    }
}
