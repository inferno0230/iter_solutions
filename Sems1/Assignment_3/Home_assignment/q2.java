package Sems1.Assignment_3.Home_assignment;
/* Write a java program that prompts the user to enter an integer for today’s day of the
week (Sunday is 0, Monday is 1… and Saturday is 6). Also prompt the user to enter
the number of days after today for a future day and display the future day of the week.
Here is a sample run:
Enter today's day: 1
Enter the number of days elapsed since today: 3
Today is Monday and the future day is Thursday
Enter today's day: 0 Enter the number of days elapsed
since today: 31
Today is Sunday and the future day is Wednesday */

import java.util.Scanner;

public class q2 {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.print("Enter today's day: ");
    int today = scan.nextInt();
    System.out.print("Enter the number of days elapsed since today: ");
    int daysElapsed = scan.nextInt();

    int futureDay = (today + daysElapsed) % 7;
    String dayName;
    switch (today) {
      case 0:
        dayName = "Sunday";
        break;
      case 1:
        dayName = "Monday";
        break;
      case 2:
        dayName = "Tuesday";
        break;
      case 3:
        dayName = "Wednesday";
        break;
      case 4:
        dayName = "Thursday";
        break;
      case 5:
        dayName = "Friday";
        break;
      default:
        dayName = "Saturday";
    }

    String futureDayName;
    switch (futureDay) {
      case 0:
        futureDayName = "Sunday";
        break;
      case 1:
        futureDayName = "Monday";
        break;
      case 2:
        futureDayName = "Tuesday";
        break;
      case 3:
        futureDayName = "Wednesday";
        break;
      case 4:
        futureDayName = "Thursday";
        break;
      case 5:
        futureDayName = "Friday";
        break;
      default:
        futureDayName = "Saturday";
    }

    System.out.println("Today is " + dayName + " and the future day is " + futureDayName);
    scan.close();
  }
}
