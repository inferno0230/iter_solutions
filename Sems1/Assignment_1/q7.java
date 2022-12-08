package Sems1.Assignment_1;

/* Write a java program to exchange the values of two variables of integer type X and Y using
third temporary variable Z */
public class q7 {

	public static void main(String[] args)
	{
		System.out.println("Before Swap");
		int x = 1722, y = 230, z;
		z = x;
		System.out.println("x = "+ z);
		z = y;
		System.out.println("y = "+ z);
		System.out.println("After Swap");
		z = y;
		System.out.println("x = "+ z);
		z = x;
		System.out.println("y = "+ z);
	}
}

