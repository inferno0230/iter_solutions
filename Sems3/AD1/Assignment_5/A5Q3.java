package Sems3.AD1.Assignment_5;

import java.util.Scanner;

public class A5Q3 {
    public static int binarySearch(int array[],int target) {
        int left = 0;
        int right = array.length;
        while (left <= right) {
            int mid = (left+right)/2;
            if(array[mid] == target) return mid;
            else if(array[mid] < target) left = mid + 1;
            else if(array[mid] > target) right = mid - 1;
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

        int index = binarySearch(array, key);
        System.out.println(key+" found at array index "+index);
    }
}
