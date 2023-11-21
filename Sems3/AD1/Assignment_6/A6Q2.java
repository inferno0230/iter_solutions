package Sems3.AD1.Assignment_6;

import java.util.Arrays;

public class A6Q2 {
    public static void main(String[] args) {
        int arr[] = {1,3,3,5,3,2,4,7,5,2,69,5,3,25,8,2,21,5,56};
        int count = 0;
        Arrays.sort(arr);
        for(int i = 0;i < arr.length;i++) count ^= arr[i];
        System.out.println(count);
    }
}

