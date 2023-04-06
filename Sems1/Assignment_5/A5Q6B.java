package Sems1.Assignment_5;
/* Write a program to print the following outputs using for loops:
1
22
333
4444
55555 */

public class A5Q6B {
    public static void main(String[]Args){
        for (int i = 1; i <= 5; i++) {
          for (int j = 1; j <= i; j++) {
            System.out.print(i+" ");
          }
          System.out.println();
        }
        
    }
}
