package Sems1.Lab_practicals;
import java.util.Scanner;

public class Electricity_Bill {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter usage type (1 for domestic, 2 for commercial): ");
        int choice = input.nextInt();
        if (choice == 1){
            System.out.print("Enter the total unit consumed: ");
            int unit = input.nextInt();
            System.out.print("Enter number of days: ");
            int days = input.nextInt();
            if (days<10){
                System.out.println(domestic_bill(unit));
            } else {
                System.out.println(domestic_bill(unit));
            }

        } else if( choice == 2){
            System.out.print("Enter the total unit consumed: ");
            int unit = input.nextInt();
            System.out.print("Enter number of days: ");
            int days = input.nextInt();
            if (days<10){
                System.out.println(commercial_bill(unit));
            } else {
                System.out.println(commercial_bill(unit+50));
            }

        } else {
            System.out.print("Invalid input");
        }
        input.close();
    }

    public static double domestic_bill(int units) {
        double bill = 0.0;
        if (units <= 100) {
            bill = units * 1.50;
        } else if (units < 300) {
            bill = 100 * 1.50 + (units - 100) * 2.50;
        } else if (units >= 300) {
            bill = 100 * 1.50 + 200 * 2.50 + (units - 300) * 3.50;
        }
        return bill;
    }
    

    public static double commercial_bill(int units) {
        double bill = 0.0;
        if (units <= 100) {
            bill = units * 2.00;
        } else if (units < 300) {
            bill = 100 * 2.00 + (units - 100) * 3.50;
        } else if (units >= 300) {
            bill = 100 * 2.00 + 200 * 3.50 + (units - 300) * 5.00;
        }
        return bill;
    }
    
}
