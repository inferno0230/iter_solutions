package Sems1.Assignment_2;
/*
 Write a java program that displays the following table. Cast floating-point numbers into
integers.

a     b     pow(a,b)
1     2     1
2     3     8
3     4     81
4     5     1024
5     6     15625
 */

import java.util.Scanner;
public class q7 {
    public static void main(String[]Args){
    double a,b;
    Scanner inp = new Scanner(System.in);
    System.out.print("Enter two value: ");
    a = inp.nextDouble();
    b = inp.nextDouble();
    System.out.println("a\t"+"b\t"+"pow(a,b)\t");
    while (a<=4){
    int c = (int)(Math.pow(a, b));
    System.out.println((int)a+"\t"+(int)b+"\t"+(int)c+"\t");
    a++;
    b++;
    }
    inp.close();
    }
}
