package Sems3.AD1.Assignment_3;

import java.util.Scanner;
public class q2 {
    public static int[] insertionSort(int arr[]) {
        int temp = 0;
        for(int i = 1; i < arr.length; i++) {
            for(int j = i; j > 0; j--) {
                if(arr[j] < arr[j-1]) {
                    // swap elements
                    temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                }
                else {
                    break;
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
        arr = insertionSort(arr);
        System.out.println("Sorted array: ");
        for(int i = 0; i < 5; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
