/*
Write a java program that prompts the user to enter the minutes (e.g., 1 billion), and displays
the number of years and days for the minutes.
For simplicity, assume a year has 365 days.
    Enter the number of minutes: 1000000000
    1000000000 minutes is approximately 1902 years and 214 days.
*/
import java.util.Scanner;
public class A2HQ1 {
    public static void main(String[]Args){
        Scanner inp = new Scanner(System.in);
        System.out.print("Enter the number of minutes: ");
        double min = inp.nextDouble();
        double years = min / 525600;
		double days = (min % 525600) / 1440;
        System.out.println((int)min+" minutes is "+(int)years+" years and "+(int)days+" days.");
        inp.close();
    }

}
