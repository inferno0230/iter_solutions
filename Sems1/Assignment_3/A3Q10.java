package Sems1.Assignment_3;
/* A University conducts a 100-mark exam for its student and grades them as follows.
Assigns a grade based on the value of the marks. Write a java program to print the
grade according to the mark secured by the student. [Use switch-case].
Mark Range
>=90 = O
>=80 AND <90 = A
>=70 AND <80 = B
>=60 AND <70 = C
>=50 AND <60 = D
>=50 AND <40 = E
<40 = F */

import java.util.Scanner;

public class A3Q10 {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.print("Enter the marks: ");
    int marks = scan.nextInt();

    char grade;
    if (marks <=100 && marks >= 0){
      switch (marks / 10) {
        case 10:
          grade = 'O';
        case 9:
          grade = 'O';
          break;
        case 8:
          grade = 'A';
          break;
        case 7:
          grade = 'B';
          break;
        case 6:
          grade = 'C';
          break;
        case 5:
          grade = 'D';
          break;
        case 4:
          grade = 'E';
          break;
        default:
          grade = 'F';
      }
      System.out.println("Grade: " + grade);
    } else {
      System.out.println("Invalid input");
    }
    scan.close();
  }
}
