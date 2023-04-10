package Sems2.Assignment_1.Home_Assignment;

public class A1QH3 {
    public static void main(String[]args){
        int a[] = {1,2,3};
        int b[] = {4,5,6};
        int c[] = dotProduct(a, b);

        for (int x:c){
            System.out.print(x+"\t");
        }
        System.out.println();
    }

    public static int[] dotProduct(int[] a, int[] b) {
        int n = a.length;
        int c[] = new int[n];
        for (int i = 0; i < n; i++) {
           c[i] = a[i] * b[i];
        }
        return c;
     }
}
