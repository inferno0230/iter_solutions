package Sems1.Assignment_2;
/*
Enter the basic salary of an employee of an organization through the keyboard. His dearness
allowance (DA) is 40% of basic salary, and house rent allowance (HRA) is 20% of basic
salary. Write a java program to calculate his gross salary. Print the DA, HRA and Gross
salary.
    Here is the sample run:
    Enter basic salary: 15600
    DA is 6240.0
    HRA is 3120.0
    Gross salary is 24960
 */
import java.util.Scanner;
public class A2Q3 {
    public static void main(String[]Args){
        float salary,g_salary;
        float da,hra;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter basic salary: ");
        salary = sc.nextFloat();
        da = salary * 40/100;
        hra = salary * 20/100;
        g_salary = salary+da+hra;
        System.out.println("DA is "+da);
        System.out.println("HRA is "+hra);
        System.out.println("Gross Salary is "+g_salary);
        sc.close();
    }
}