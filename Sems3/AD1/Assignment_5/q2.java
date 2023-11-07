package Sems3.AD1.Assignment_5;

import java.util.Scanner;

public class q2 {

    public static int linearsearch(int arr[], int size, int key){
        if (size == 0) return -1;
        else if (arr[size - 1] == key) return size - 1;
        return linearsearch(arr, size - 1, key);
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

        int index = linearsearch(array, array.length, key);
        System.out.println(key+" found at array index "+index);
    }
}
