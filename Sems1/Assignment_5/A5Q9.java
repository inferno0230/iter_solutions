package Sems1.Assignment_5; 


import java.util.Scanner;
public class A5Q9 {
    public static void main(String[]Args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int n = input.nextInt();
        input.close();
        double fact=0;

        for (int i=1;i<=n;i++){
            for (int j=1;j<=i;j++){
                fact+= (1/Math.pow(j,2));
            }
        }
        System.out.println((float)fact);
    }
}