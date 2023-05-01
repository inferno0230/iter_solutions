package Sems2.Assignment_2.A2Q10.package1;

import java.util.Scanner;
public class Test_A2Q10 extends Student_A2Q10 {
    int mark1, mark2;
    
    public void input() {
        super.input();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter mark 1: ");
        mark1 = scanner.nextInt();
        System.out.print("Enter mark 2: ");
        mark2 = scanner.nextInt();
    }
    
    public void output() {
        super.output();
        System.out.println("Mark 1: " + mark1);
        System.out.println("Mark 2: " + mark2);
    }
    
    public int getTotalMarks() {
        return mark1 + mark2;
    }
}


