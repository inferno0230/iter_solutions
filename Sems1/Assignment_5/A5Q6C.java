package Sems1.Assignment_5;
/* Write a program to print the following outputs using for loops:
1
12
123
1234
12345 */

public class A5Q6C {
    public static void main(String[]Args){
        int k = 1;
        for (int i = 1; i <= 5; i++) {
          for (int j = 1; j <= i; j++) {
            
            System.out.print(k+" ");
            k++;
          }
          System.out.println();
        }
        
    }
}
