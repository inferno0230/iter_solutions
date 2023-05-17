package Sems2.Assignment_3;
import java.util.Scanner;

public class A3Q2 {
    public static void main(String []args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter four colours");
        String arr[] = new String[3];

        for(int i=0;i<arr.length;i++) {
            arr[i] = input.nextLine();
        }

        try {
            int temp = Integer.parseInt(arr[0]);
        } catch(NumberFormatException e) {
            System.out.print(e);
        }

    }
}
