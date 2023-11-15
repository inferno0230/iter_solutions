package Sems3.AD1.Assignment_2;
public class A2Q6 {
   public static void main(String[] args) {
        hexadecimal(163);
   }
   static char[] a={'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
   static void hexadecimal(int n){
        if (n==0) {
            return;
        }
        int x=n%16;
        hexadecimal(n/16);
        System.out.print(a[x]);
   } 
}
