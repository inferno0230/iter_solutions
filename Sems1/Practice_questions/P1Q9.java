package Sems1.Practice_questions;

import java.util.Scanner;
public class P1Q9 {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        int a[] = new int[10];
        System.out.println("Enter ten numbers: ");
        for (int i=0;i<a.length;i++){
            a[i] = input.nextInt();
        }
        System.out.println("Enter item to search: ");
        int item = input.nextInt();
        input.close();

        System.out.println("The element is present in the array at position: "+Lsearch(a, item));

    }

    public static int Lsearch(int array[], int item){
        int index = -1;

        for (int i=0;i<array.length;i++){
            if(item==array[i]){
                index=(i+1);
            }
        }

        return index;
    }
    
}
