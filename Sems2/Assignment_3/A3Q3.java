package Sems2.Assignment_3;
import java.util.Scanner;

class MarksOutOfBound extends Exception{

    protected MarksOutOfBound(String s) {
        super(s);
    }
    
}

public class A3Q3 {
    public static void main(String []args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the name of the student");
        System.out.println("Enter marks");
        int marks = input.nextInt();
        try {
            if (marks > 100) {
                throw new MarksOutOfBound("Mark can't be greater than 100");
            }
        } catch(MarksOutOfBound e){
            System.out.println(e);
        } finally {
            input.close();
        }

    }
}
