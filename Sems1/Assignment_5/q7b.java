package Sems1.Assignment_5;
/* Write a program to print the following outputs using for loops:
 $ $ $ $ $
 $ $ $ $
 $ $ $
 $ $ 
 $ 
 */
public class q7b {
  public static void main(String[] args) {
    for (int i = 5; i >= 1; i--) {
      for (int j = 1; j <= i; j++) {
        System.out.print("$ ");
      }
      System.out.println();
    }
  }
}
