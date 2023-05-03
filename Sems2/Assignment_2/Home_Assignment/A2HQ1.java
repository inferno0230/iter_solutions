package Sems2.Assignment_2.Home_Assignment;
import java.util.Scanner;

class Commission {
    double sales;

    Commission(double sales) {
        this.sales = sales;
    }

    double getCommission() {
        double commission = 0.0;
        if (sales >= 0 && sales <= 100) {
            commission = (2/100) * sales;
        } else if (sales > 100 && sales <= 500) {
            commission = (3/100) * sales;
        } else if (sales > 500 && sales <= 5000) {
            commission = (5/100) * sales;
        } else if (sales > 5000) {
            commission = (8/100) * sales;
        }
        return commission;
    }
}

public class A2HQ1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter sales amount: ");
        double sales = scanner.nextDouble();

        if (sales < 0) {
            System.out.println("Invalid Input");
        } else {
            Commission u1 = new Commission(sales);
            double result = u1.getCommission();
            System.out.println("The commission is "+ result);
        }
    }
}

