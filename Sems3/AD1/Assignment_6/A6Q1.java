package Sems3.AD1.Assignment_6;

public class A6Q1 {
    public static void main(String[] args) {
        int arr[] = {1, 5, 3, 19, 18, 25};
        int max = Integer.MAX_VALUE;
        int min = Integer.MIN_VALUE;
        int minIndex[] = {-1,-1};
        int maxIndex[] = {-1,-1};
        System.out.println(arr.length);
        for(int i = 0;i < arr.length;i++) {
            for(int j = i;j < arr.length;j++) {
                int currentDiff = arr[i] - arr[j];
                if(currentDiff < max) {
                    max = currentDiff;
                    maxIndex[0] = i;
                    maxIndex[1] = j;
                }
                if(currentDiff > min) {
                    min = currentDiff;
                    minIndex[0] = i;
                    minIndex[1] = j;
                }
            }
        }
        System.out.println(max+" is max.");
        System.out.println(arr[maxIndex[0]]+" - "+arr[maxIndex[1]]);
        System.out.println(min+" is min.");
        System.out.println(arr[minIndex[0]]+" - "+arr[minIndex[1]]);
    }
}