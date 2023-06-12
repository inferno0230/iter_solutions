package Sems2.Assignment_3.Home_assignment;
/* Given an unsorted array, A, of integers and an integer  k, write recursive program using Java 
for  rearranging  the  elements  in  A  so  that  all  elements  less  than  or  equal  to  k  come  before 
any elements larger than k. */

import java.util.Scanner;

public class A3HQ4 {
    static void rearrange(int[] arr, int n, int k) {
        if (n == 0) {
            return;
        }
        if (arr[n - 1] <= k) {
            System.out.print(arr[n - 1] + " ");
        }
        rearrange(arr, n - 1, k);
        if (arr[n - 1] > k) {
            System.out.print(arr[n - 1] + " ");
        }
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
        System.out.print("Enter k: ");
        int k = input.nextInt();
        input.close();
        rearrange(arr, n, k);
    }
}
