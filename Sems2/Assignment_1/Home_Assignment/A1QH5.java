package Sems2.Assignment_1.Home_Assignment;

import java.util.Random;

public class A1QH5 {
    public static void main(String[] args) {
        // Create a 4x4 arr
        int[][] arr = new int[4][4];
        
        // Fill the arr with random 0s and 1s
        Random rand = new Random();
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                arr[i][j] = rand.nextInt(2);
            }
        }
        
        for (int x[]:arr) {
            for (int y:x) {
                System.out.print(y + " ");
            }
            System.out.println();
        }
        
        int maxRow = 0;
        int maxCol = 0;
        int maxCount = 0;
        for (int i = 0; i < arr.length; i++) {
            int rowSum = 0;
            int colSum = 0;
            for (int j = 0; j < arr[0].length; j++) {
                rowSum += arr[i][j];
                colSum += arr[j][i];
            }
            if (rowSum > maxCount) {
                maxCount = rowSum;
                maxRow = i;
            }
            if (colSum > maxCount) {
                maxCount = colSum;
                maxCol = i;
            }
        }
        
        // Print the result
        System.out.println("The largest row index: " + (maxRow+1));
        System.out.println("The largest column index: " + (maxCol+1));
    }
}

