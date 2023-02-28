package Sems1.Assignment_4.Home_assignment;
/* If we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3, 5, 6 and 9.
The sum of these multiples is 23. Write a java program to find the sum of all the multiples
of 3 or 5 below 1000 . */
public class A4HQ2 {
        public static void main(String[] args) {
                int sum=0;
                for (int i=1;i<=999;i++) {
                        if (i%3==0 || i%5==0) {
                                sum += i;
                        }
                }
                System.out.print("Sum of all natural numbers which are multiples of 3 and 5 below 1000 is = "+sum);
        }
}

