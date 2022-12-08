package Sems1.Assignment_2.Home_assignment;
/*
Write a java program that prompts the user to enter three points (x1, y1), (x2, y2), (x3, y3) of
a triangle and displays its area. The formula for computing the area of a triangle is
    s = (side1 + side2 + side3)/2;
    area=√𝑠 ∗ (𝑠 − 𝑎) ∗ (𝑠 − 𝑏) ∗ (𝑠 − 𝑐)
    Here is a sample run:
    Enter three points for a triangle: 1.5 -3.4 4.6 5 9.5
    -3.4
    The area of the triangle is 33.6
 */

import java.util.Scanner;
public class q3 {
    public static void main(String[]Args){
        double x1,x2,x3,y1,y2,y3;
        Scanner input = new Scanner(System.in);
		System.out.print("Enter three points for a triangle: ");
		x1 = input.nextDouble();
		y1 = input.nextDouble();
		x2 = input.nextDouble();
		y2 = input.nextDouble();
		x3 = input.nextDouble();
		y3 = input.nextDouble();

        double s1,s2,s3,s,area;
		s1 = Math.pow(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2), 0.5);
		s2 = Math.pow(Math.pow(x3 - x2, 2) + Math.pow(y3 - y2, 2), 0.5);
		s3 = Math.pow(Math.pow(x1 - x3, 2) + Math.pow(y1 - y3, 2), 0.5);
		s = (s1 + s2 + s3) / 2;
		area = Math.pow(s * (s - s1) * (s - s2) * (s - s3), 0.5);
        System.out.println("The area of the triangle is " + (float)area);
        input.close();
    }
}
