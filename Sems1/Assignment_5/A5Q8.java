/* WAP to enter the value of n and display find the following b of the series:
(0 + 1) + (1 + 2) + (1+ 2 +3) ..... + (1 + 2 + 3 + .... + n) */

import java.util.Scanner;
public class A5Q8 {
    public static void main(String[]Args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int n = input.nextInt();
        input.close();
        int sum=0;
        
        for (int i=1;i<=n;i++){
            for (int j=1;j<=i;j++){
                sum+=j;
            }
        }
        System.out.println(sum);
    }
}
