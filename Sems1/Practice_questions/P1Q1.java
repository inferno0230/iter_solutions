package Sems1.Practice_questions;

import java.util.*;
public class P1Q1 {
        public static void main(String[]Args){
            Scanner input = new Scanner(System.in);
            System.out.print("Enter size of array:");
            int size=input.nextInt();
            int n[]=new int[size];
            input.close();
        
            for(int i=0;i<=n.length-1;i++) {
                Random rand = new Random();
                n[i] = rand.nextInt(1, size);
        }

        System.out.println("The sum of value's present in array is "+add(n));
        System.out.println("the avg of value's present in array is "+avg(n));
        }

        public static int add(int a[]){
        int sum = 0;
        for (int i=0;i<a.length;i++){
            sum+=a[i];
        }
        return sum;
    }

    public static double avg(int a[]){
        double avg = add(a)/a.length;
        return avg;
    }
    
}

