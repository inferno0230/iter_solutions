package Sems1.Assignment_5;
/*  Write a program to display the multiplication table from 2 to 15. */

public class q5{
    public static void main(String[]Args){
        for(int i = 2; i <= 15; i++) {
            System.out.println("Multiplication table of "+i);
          for(int j = 1; j <=10; j++) {
            System.out.println(i + " x " + j + " = " + i*j);
          }
          System.out.println();
        }
        
    }
}