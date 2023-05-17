package Sems2.Assignment_3;
import java.util.Scanner;

public class A3Q5 {

    public static <T> int count(T[] array, T item) {
        int count = 0;
        for (T element : array) {
            if (element != null && element.equals(item)) {
                count++;
            }
        }
        return count;
    }    
    
    public static void main(String[]args) {
        Scanner ganyu = new Scanner(System.in);
        Integer arr[] = new Integer[5];
        System.out.println("Enter elements of array");

        for(int i=0;i<arr.length;i++) {
            arr[i] = Integer.parseInt(ganyu.nextLine());
        }
        System.out.println("Enter the element to search");
        System.out.print("Count: "+count(arr,ganyu.nextInt()));
    }
}
