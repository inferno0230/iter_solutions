package Sems2.Assignment_1;

import java.util.Scanner;
public class A1Q7 {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number of elements of Array: ");
        int a[] = new int[input.nextInt()];
        for (int i=0;i<a.length;i++){
            System.out.print("Enter elements of the array: ");
            a[i]=input.nextInt();
        }
        input.close();

        System.out.println("Maximum element of Array is "+max(a)+" and occurs "+count(a,max(a)));
        System.out.println("Maximum element of Array is "+min(a)+" and occurs "+count(a,min(a)));
        System.out.println("First occurrence of maximum element is at position "+first_occ(a, max(a)));
        System.out.println("Last occurrence of minimum element is at position "+last_occ(a, min(a)));

    }

    public static int max(int a[]){
        int max = a[0];
        for (int i=0;i<a.length;i++){
            if(max<a[i]){
                max = a[i];
            }
        }
        return max;
    }

    public static int min(int a[]){
        int min = a[0];
        for (int i=0;i<a.length;i++){
            if(min>a[i]){
                min = a[i];
            }
        }
        return min;
    }

    public static int count(int a[],int b){
        int count = 0;
        for (int i=0;i<a.length;i++){
            if(a[i]==b){
                count++;
            }
        }
        return count;

    }

    public static int first_occ(int a[],int b){
        int first_occ = -1;
        for (int i=0;i<a.length;i++){
            if(b==a[i]){
                first_occ = i+1;
                break;
            }
            
        }
        return first_occ;
    }

    public static int last_occ(int a[],int b){
        int last_occ = -1;
        for (int i=0;i<a.length;i++){
            if(a[i]==b){
                last_occ = i+1;
            }
        }
        return last_occ;
    }
}
