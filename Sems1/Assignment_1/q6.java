package Sems1.Assignment_1;

/* 
    Write a java program to store your Bank account no, name and balance in three different
    variables and display their value on the screen as given:
    
    My name is Amit Kumar bearing account number 123456
    having balance 7654.98
 */
public class q6 {
	public static void main(String[] args) {
		int acc_no = 123456 ;
		String name = "Aditya Choudhury" ;
		double bal = 7654.98d ; //Always add "d" as suffix whenever using double, same goes for float where we have to use "f"
		System.out.println("My name is "+ name+ " bearing account number "+ acc_no+ " having balance "+ bal);
	}

}