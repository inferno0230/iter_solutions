package Sems2.Assignment_1;
/* Write a Java program that can take a positive integer greater than 2 as input and write out the 
number  of  times  one  must  repeatedly  divide  this  number  by  2  before  getting  a  value  less 
than 2.

Sample Run:
The positive integer greater than 2 from command line argument
is 67.
The number of times one must repeatedly divide this number by 2
before getting a value less than 2 is 5. */

public class A1Q1 {
    public static void main (String[]args){
        int n = Integer.parseInt(args[0]);
        System.out.print("The positive integer greater than 2 from command line argument is "+n+".\n");
        int count = 0;
        while(n>2){
            n = n/2;
            count++;
        }
        System.out.println("The number of times one must repeatedly divide this number by 2 before getting a value less than 2 is "+count+".");
    }
}