package Sems3.AD1.Assignment_3;

import java.util.Scanner;
public class q1 {
    public static int[] bubbleSort(int arr[]) {
        int temp = 0;
        for(int i = 0; i < arr.length; i++) {
            for(int j = 1; j < arr.length-i; j++) {
                if(arr[j - 1] > arr[j]) {
                    // swap elements
                    temp = arr[j - 1];
                    arr[j - 1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int arr[] = new int[5];
        System.out.println("Enter 5 numbers: ");
        for(int i = 0; i < 5; i++) {
            arr[i] = input.nextInt();
        }
        input.close();
        arr = bubbleSort(arr);
        System.out.println("Sorted array: ");
        for(int i = 0; i < 5; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
