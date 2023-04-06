package Sems1.Assignment_3;
/* From the above question no. (6) write a java program with a choice if the consumer
wants to pay bill online. Consumer who pays their electricity bill online will get a
discount of 3%.
Here is the sample output:
No. of units consumed: 867
Do you want to pay online(y/n): y
Total amount: 4925.4
Discount: 147.762
Amount payable: 4777.638 */
import java.util.Scanner;
public class A3Q7{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter number of units consumed: ");
        int units = scan.nextInt();
        double bill = 0.0;
        if (units <= 50) {
            bill = units * 3;
        } else if (units <= 200) {
            bill = (50 * 3) + (units - 50) * 4.80;
        } else if (units <= 400) {
            bill = (50 * 3) + (150 * 4.80) + (units - 200) * 5.80;
        } else {
            bill = (50 * 3) + (150 * 4.80) + (200 * 5.80) + (units - 400) * 6.20;
        }
        System.out.print("\nDo you want to pay online(y/n): ");
        String choice = scan.next();
        if(choice.equalsIgnoreCase("y")){
            double discount = bill*(3.0/100.0);
            System.out.println("Total amount: " +(int)bill);
            System.out.println("Discount: " +(int)discount);
            System.out.println("Amount payable: " +(bill-(int)(discount)));
        } else if(choice.equalsIgnoreCase("n")) {
            System.out.println("Electricity bill: Rs." + bill);
        }
        scan.close();
    }
}