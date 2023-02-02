package Sems1.Assignment_3;
/* Write a java program that takes the x – y coordinates of a point in the Cartesian plane
and prints a message telling either an axis on which the point lies or the quadrant in
which it is found.
Here is the sample output:
(-1.0, -2.5) is in quadrant III
(0.0, 4.8) is on the y-axis */

import java.util.Scanner;

public class q8 {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.print("Enter x coordinate: ");
    double x = scan.nextDouble();
    System.out.print("Enter y coordinate: ");
    double y = scan.nextDouble();

    if (x == 0 && y == 0) {
      System.out.println("(0, 0) is on the origin.");
    } else if (x == 0) {
      System.out.println("(" + x + ", " + y + ") is on the y-axis.");
    } else if (y == 0) {
      System.out.println("(" + x + ", " + y + ") is on the x-axis.");
    } else if (x > 0 && y > 0) {
      System.out.println("(" + x + ", " + y + ") is in quadrant I.");
    } else if (x < 0 && y > 0) {
      System.out.println("(" + x + ", " + y + ") is in quadrant II.");
    } else if (x < 0 && y < 0) {
      System.out.println("(" + x + ", " + y + ") is in quadrant III.");
    } else {
      System.out.println("(" + x + ", " + y + ") is in quadrant IV.");
    }
    scan.close();
  }
}
