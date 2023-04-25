package Sems2.Assignment_2;
import java.security.spec.DSAGenParameterSpec;
import java.util.Scanner;

class Student {
    int rollNo;
    String name;
    double dsaMarks;

    void getData() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the roll number of the student: ");
        this.rollNo = input.nextInt();
        System.out.print("Enter the name of the student: ");
        this.name = input.next();
        System.out.print("Enter the DSA Marks of the student: ");
        this.dsaMarks = input.nextDouble();
        }

    void showData() {
        System.out.print("Name: "+name+"\n"+"Roll number: "+rollNo+"\n"+"Dsa marks: "+dsaMarks+"\n"+"\n");
    }


}

public class A2Q3 {
    public static void main(String[]args){
        Student[] user = new Student[5];
        for (int i = 0; i < user.length; i++) {
            user[i] = new Student();
            System.out.println("Enter the details of Student " + (i+1));
            user[i].getData();
            user[i].showData();
        }

        
        int number = 0;
        for(int i=0;i<user.length;i++){
            double max = user[0].dsaMarks;
            if (user[i].dsaMarks > max){
                max = user[i].dsaMarks;
                number = i;
            }
        }
        System.out.println(user[number].name+" with roll number "+user[number].rollNo+" got highest marks in DSA of "+user[number].dsaMarks);
        
    }
}
