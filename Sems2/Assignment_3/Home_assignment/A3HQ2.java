package Sems2.Assignment_3.Home_assignment;
// Write a recursive method in Java to search an element of an array using binary search
 
import java.util.Scanner;

public class A3HQ2 {
    static int binarySearch(int[] arr, int low, int high, int key) {
        if (high >= low) {
            int mid = (low + high) / 2;
            if (arr[mid] == key) {
                return mid;
            } else if (arr[mid] > key) {
                return binarySearch(arr, low, mid - 1, key);
            } else {
                return binarySearch(arr, mid + 1, high, key);
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number of elements: ");
        int n = input.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter elements: ");
        for (int i = 0; i < n; i++) {
            arr[i] = input.nextInt();
        }
        System.out.print("Enter element to search: ");
        int key = input.nextInt();
        input.close();
        int result = binarySearch(arr, 0, n - 1, key);
        if (result == -1) {
            System.out.println("Element not found");
        } else {
            System.out.println("Element found at index " + result);
        }
    }
}
