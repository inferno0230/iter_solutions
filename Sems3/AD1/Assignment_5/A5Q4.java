package Sems3.AD1.Assignment_5;

import java.util.Scanner;
public class A5Q4 {

    public static int resursiveBinarySearch(int arr[], int left, int right, int x) {
        if (right >= left) {
            int mid = left + (right - left) / 2;
            if (arr[mid] == x) return mid;
            if (arr[mid] > x) return resursiveBinarySearch(arr, left, mid - 1, x);
            return resursiveBinarySearch(arr, mid + 1, right, x);
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter size of array: ");
        int array[] = new int[input.nextInt()];
        System.out.println("Enter elements of array: ");
        for(int i = 0;i < array.length;i++) array[i] = input.nextInt();
        System.out.println("Enter number to find from array: ");
        int key = input.nextInt();
        input.close();

        int index = resursiveBinarySearch(array,0, array.length - 1, key);
        System.out.println(key+" found at array index "+index);
    }
}
