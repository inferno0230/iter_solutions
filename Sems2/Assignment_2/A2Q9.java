package Sems2.Assignment_2;

import java.util.Scanner;

class Student_A2Q9 {  // Using Student2 instead of Student to avoid the compiler pointing to different previously defined class
    protected int rollNumber;
    protected String name;
    protected String course;

    public void input_Student() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter roll number:");
        rollNumber = scanner.nextInt();
        System.out.println("Enter name:");
        name = scanner.next();
        System.out.println("Enter course:");
        course = scanner.next();
    }

    public void display_Student() {
        System.out.println("Roll number: " + rollNumber);
        System.out.println("Name: " + name);
        System.out.println("Course: " + course);
    }
}

class Exam_A2Q9 extends Student_A2Q9 { // Using Exam2 instead of Exam to avoid the compiler pointing to different previously defined class
    private int mark1;
    private int mark2;
    private int mark3;

    public void input_Marks() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter marks for subject 1:");
        mark1 = scanner.nextInt();
        System.out.println("Enter marks for subject 2:");
        mark2 = scanner.nextInt();
        System.out.println("Enter marks for subject 3:");
        mark3 = scanner.nextInt();
    }

    public void display_Result() {
        System.out.println("Marks for subject 1: " + mark1);
        System.out.println("Marks for subject 2: " + mark2);
        System.out.println("Marks for subject 3: " + mark3);
    }
}

public class A2Q9 {
    public static void main(String[] args) {
        Exam_A2Q9[] exams = new Exam_A2Q9[5];

        for (int i = 0; i < 5; i++) {
            exams[i] = new Exam_A2Q9();
            System.out.println("Enter details for student " + (i + 1) + ":");
            exams[i].input_Student();
            exams[i].input_Marks();
        }

        System.out.println("Details of all students:");

        for (int i = 0; i < 5; i++) {
            exams[i].display_Student();
            exams[i].display_Result();
            System.out.println();
        }
    }
}
