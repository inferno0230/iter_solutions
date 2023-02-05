package Sems1.Assignment_4.Home_assignment;
/* Write a java program in which using one for loop and one if statement, prints the integers
from 1,000 to 2,000 with five integers per line. Hint: Use the % operation. */


public class q3 {
    public static void main(String[] args) {
      for (int i = 1000; i <= 2000; i++) {
        System.out.print(i + " ");
        if (i % 5 == 4) {
          System.out.println();
        }
      }
    }
  }
