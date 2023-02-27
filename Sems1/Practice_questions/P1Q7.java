package Sems1.Practice_questions;

import java.util.Scanner;
public class P1Q7 {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        int a[] = new int[5];
        for (int i=0;i<a.length;i++){
            System.out.println("Enter five numbers: ");
            a[i] = input.nextInt();
        }
        input.close();

        System.out.print("The second maximum number is: "+max(a));


    }

    public static int max(int[] array){
        int max = array[0];
        int sec_max = Integer.MIN_VALUE;
        for (int i=0;i<array.length;i++){
            for(int j=0;j<array.length;j++){
                if(max<array[j]){
                    sec_max = max;
                    max = array[j];
                }
                
            }

        }

        for (int i=0;i<array.length;i++){
            for(int j=0;j<array.length;j++){
                if(sec_max<array[j] && array[j]<max){
                    sec_max = array[j];
                }
                
            }

        }
        return sec_max;
    }
}
