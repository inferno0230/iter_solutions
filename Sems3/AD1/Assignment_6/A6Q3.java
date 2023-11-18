package Sems3.AD1.Assignment_6;

import java.util.Arrays;
import java.util.Scanner;
public class A6Q3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int[] nums = new int[input.nextInt()];
        System.out.println("Enter the elements of the array: ");
        for(int i=0; i<nums.length; i++) {
            nums[i] = input.nextInt();
        }
        input.close();
        Arrays.sort(nums);
        int count = 1;
        for(int i=0; i<nums.length-1; i++) {
            if(nums[i] == nums[i+1]) {
                count++;
            } else {
                System.out.println(nums[i] + " appears " + count + " times.");
                count = 1;
            }
        }
        System.out.println(nums[nums.length - 1] + " appears " + count + " times.");
    }
}
