package Sems3.AD1.Assignment_6;

import java.util.Arrays;
import java.util.Scanner;

public class A6Q4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        char[] arr = new char[input.nextInt()];
        System.out.println("Enter the elements of the array: ");
        for(int i=0; i < arr.length; i++) {
            arr[i] = input.next().charAt(0);
        }
        input.close();
        Arrays.sort(arr);
        int count = 1;
        for(int i = 0; i < arr.length - 1; i++) {
            if(arr[i] == arr[i+1]) {
                count++;
            } else {
                System.out.println(arr[i] + " appears " + count + " times.");
                count = 1;
            }
        }
        System.out.println(arr[arr.length - 1] + " appears " + count + " times.");
    }
}
