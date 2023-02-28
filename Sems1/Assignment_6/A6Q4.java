
import java.util.Scanner;
public class A6Q4 {
    public static void main(String[]Args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter first year: ");
        int x = input.nextInt();
        System.out.print("Enter last year: ");
        int y = input.nextInt();
        input.close();
        int sum = 0;

        for (int i = x;i <= y; i++){
            if(leapYear(i)==true){
                sum+=numberOfDaysInAYear(i);
            } else { 
                sum+=numberOfDaysInAYear(i);
            }
        }
        System.out.println("Total number of days b/w "+x+" and "+y+" is "+sum);
    }

    public static int numberOfDaysInAYear(int year){
        int days = 0;
        if (leapYear(year)==true){
            days+=366;
        } else {
            days+=365;
        }
        return days;
        
    }

    public static boolean leapYear(int x){
        boolean check = false;
        if (x%4==0 && x%100!=0){
            check = true;
        } else if (x%400==0){
            check = true;
        }
        return check;
    }
    
}
