package Sems1.Assignment_2;
/*
 The distance between two cities (in km.) is input through the keyboard. Write a java program
to convert and print this distance in meters, feet, inches and centimetres.
Hint:
1km=1000meter, 1km=3280.8399feet, 1km= 39370.0787 inch,
1km= 100000 centimetre
Here is the sample run:
    Enter the distance in km=165
    165 km is 165000 meters
    165 km is 541338.5835 feet
    165 km is 6496062.9854999995 inch
    165 km is 16500000 centimetres
 */
import java.util.Scanner;
public class q2 {
    public static void main(String[]Args){
        int km,m, cm;
        double feet,inch;
        Scanner sc = new Scanner(System.in);
        System.out.print("Input distance in Kilometers: ");
        km = sc.nextInt();
        cm = km * 100000;
        m = km * 1000;
        feet = km * 3280.8399;
        inch = km * 39370.0787;
        System.out.println(km+" km is "+m);
        System.out.println(km+" km is "+feet);
        System.out.println(km+" km is "+inch);
        System.out.println(km+" km is "+cm);
        sc.close();
    }
}