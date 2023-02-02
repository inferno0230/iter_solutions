package Sems1.Assignment_4.Home_assignment;
/* Write a java program to find the difference between the sum of the squares of the first ten
natural numbers and the square of the sum.The sum of the squares of the first ten natural numbers is:
1 2 + 2 2 + 3 2 + 4 2 + 5 2 + 6 2 + 7 2 + 8 2 + 9 2 + 10 2 = 385
The square of the sum of the first ten natural numbers is:
(1 + 2 + ... + 10) 2 = 55 2 = 3025
Hence the difference between the sum of the squares of the first
ten natural numbers and the square of the sum is 3025 − 385 =
2640. */

public class q1 {
	public static void main(String[] args) {
	int sum = 0;
	int sum_2 = 0;
	for(int init =1 ;init<=10;init++) {
		double pow = (double)Math.pow(init, 2);
		sum += pow;
	}
	for(int init =1 ;init<=10;init++) {
		sum_2 += init;
	}
	double sum_2_sq = Math.pow(sum_2, 2);
	System.out.println("The sum of the squares of the first ten natural numbers is:\n"
			+ "1^2 + 2^2 + 3^2 + 4^2 + 5^2 + 6^2 + 7^2 + 8^2 + 9^2 + 10^2 = "+sum);
	System.out.println("The square of the sum of the first ten natural numbers is:\n"
			+ "(1 + 2 + ... + 10)^2 =("+sum_2+")^2"+"= "+(int)sum_2_sq);
	}
}
