package Sems1.Practice_questions;

public class P1Q8 {
    public static void main(String[]args){
        int a[] = {1,2,3,4,5,6,7,8};
        int b[] = rev(a);

        for (int i=0;i<b.length;i++){
            System.out.println(a[i]);
        }

    }

    public static int[] rev(int a[]){
        int i = 0;
        int j = a.length - 1;
        while (i < j) {
            int temp = a[i];
            a[i] = a[j];
            a[j] = temp;
            i++;
            j--;
        }
        return a;
    }
}
