package Sems1.Assignment_3.Home_assignment;/* Write a java program that randomly generates an integer between 1 and 12 and displays
the English month name January, February… December for the number 1, 2… 12,
accordingly. */

import java.util.Random;
public class A3HQ3 {
  public static void main(String[] args) {
    Random rand = new Random();
    
    int month = rand.nextInt(12) + 1;
    
    String monthName;
    switch (month) {
      case 1:
        monthName = "January";
        break;
      case 2:
        monthName = "February";
        break;
      case 3:
        monthName = "March";
        break;
      case 4:
        monthName = "April";
        break;
      case 5:
        monthName = "May";
        break;
      case 6:
        monthName = "June";
        break;
      case 7:
        monthName = "July";
        break;
      case 8:
        monthName = "August";
        break;
      case 9:
        monthName = "September";
        break;
      case 10:
        monthName = "October";
        break;
      case 11:
        monthName = "November";
        break;
      default:
        monthName = "December";
    }
    
    System.out.println("The randomly generated month is " + monthName + ".");
  }
}