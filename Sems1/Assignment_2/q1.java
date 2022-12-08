package Sems1.Assignment_2;
/*
Write a java program that reads a Fahrenheit degree in a double value from the console, then
converts it to Celsius and displays the result. The formula for the conversion is as follows:

Celsius = (Fahrenheit-32) *(5/9)
Hint: Hint: In Java, 5 / 9 is 0, but 5.0 / 9 is 0.556
Here is a sample run:
Enter a degree in Fahrenheit: 54
54 Fahrenheit is 12.22 Celsius
 */
import java.util.Scanner;

public class q1 {

    public static void main(String[] Strings) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Input a degree in Fahrenheit: ");
        int far = sc.nextInt();

        double celsius =(( 5 *(far - 32.0)) / 9.0);
        System.out.println(far + " degree Fahrenheit is equal to " + celsius + " in Celsius");
    }
}

