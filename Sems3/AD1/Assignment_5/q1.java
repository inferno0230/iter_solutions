package Sems3.AD1.Assignment_5;

import java.util.Scanner;
public class q1 {

    public static int linearSearch(int arr[],int target) {
        for(int i = 0;i < arr.length;i++) {
            if(arr[i] == target) return i;
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
        System.out.println(key+" found at array index"+linearSearch(array, key));
    }
}
