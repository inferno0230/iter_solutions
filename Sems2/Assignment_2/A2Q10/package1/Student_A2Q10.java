package Sems2.Assignment_2.A2Q10.package1;

import java.util.Scanner;

public class Student_A2Q10 {
    String name;
    int roll;
    
    public void input() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter student name: ");
        name = scanner.nextLine();
        System.out.print("Enter student roll number: ");
        roll = scanner.nextInt();
    }
    
    public void output() {
        System.out.println("Student name: " + name);
        System.out.println("Student roll number: " + roll);
    }
}


