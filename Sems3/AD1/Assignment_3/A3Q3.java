package Sems3.AD1.Assignment_3;

import java.util.Scanner;
public class A3Q3 {
    public static int[] selectionSort(int arr[]) {
        int temp = 0;
        for(int i = 0; i < arr.length; i++) {
            int min = i;
            for(int j = i+1; j < arr.length; j++) {
                if(arr[j] < arr[min]) {
                    min = j;
                }
            }
            // swap elements
            temp = arr[i];
            arr[i] = arr[min];
            arr[min] = temp;
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
        arr = selectionSort(arr);
        System.out.println("Sorted array: ");
        for(int i = 0; i < 5; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
