/*
 Write a java program that reads the radius of a hemisphere and computes the surface area
and volume using the following formulas:
Surface Area of Hemisphere = 3 π r 2. Volume of a hemisphere = (2/3)πr 3
Where π is a constant whose value is equal to 3.14 approximately. “r” is the radius of the
hemisphere. Hint: Use Math.PI. :=
    Here is a sample run:
    Enter the radius of the hemisphere: 7.0
    The surface area of the hemisphere is 461.814
    The volume area of the hemisphere is 718.377
 */
import java.util.Scanner;
public class A2Q5 {
    public static void main(String[]Args){
        double rad,sa,va;
        Scanner inp = new Scanner(System.in);
        System.out.print("Enter the radius of the hemisphere: ");
        rad = inp.nextDouble();
        sa = 3*Math.PI*Math.pow(rad, 2);
        va = (2.0/3)*Math.PI*Math.pow(rad, 3);
        System.out.println("The surface area of the hemisphere is "+sa);
        System.out.println("The volume area of the hemisphere is "+va);
        inp.close();
    }
}
