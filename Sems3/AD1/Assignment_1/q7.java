/* Find the smallest positive integer from a given array of positive and negative integer. */

import java.util.*;
public class q7 {
    public static void main(String[] args) {
        int[] a={4,1,2,3,-7,-5,0,8,5,};
        System.out.println(missingno(a));
    }

    static int missingno(int[] nums) {
        int i = 0;
        while (i < nums.length) {
            int correct = nums[i] - 1;
            if (nums[i] <= nums.length && nums[i] > 0 && nums[i] != nums[correct]) {
                int temp = nums[i];
                nums[i] = nums[correct];
                nums[correct] = temp;
            } else {
                i++;
            }
        }

        int count = 0;
        for (int j = 0; j < nums.length; j++) {
            if (nums[j] != j + 1) {
                return j + 1;
            }
        }
        return nums.length+1;
    }
}