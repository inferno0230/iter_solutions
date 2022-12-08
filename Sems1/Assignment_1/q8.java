package Sems1.Assignment_1;

/*Write a java program to exchange the values of two variables of integer type X and Y without
using third temporary variable. */
public class q8 {

	public static void main(String[] args)
	{

		int x = 5, y = 6;
		System.out.println("Before Swap");
		System.out.println("x = " + x);
		System.out.println("y = " + y);
        y=x+y;
        x=y-x;
        y=y-x;
		System.out.println("After swap");
		System.out.println("x = " + x);
		System.out.println("y = " + y);
	}
}
