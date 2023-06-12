package Sems2.Assignment_3.Home_assignment;

/* Create a class Bank with instance variables  account_no, name, and  balance of the customer.  
If the   input       balance is less than or equal to zero then create an Exception called   “Invalid 
BalanceException” and throw it using Java. Display the custom message “Balance cannot be 
less than 0”. */

import java.util.Scanner;

class InvalidBalanceException extends Exception {
    InvalidBalanceException(String s) {
        super(s);
    }
} 

class Bank {
    int account_no;
    String name;
    double balance;

    Bank(int account_no, String name, double balance) {
        this.account_no = account_no;
        this.name = name;
        this.balance = balance;
    }

    void display() {
        System.out.println("Account Number: " + account_no);
        System.out.println("Name: " + name);
        System.out.println("Balance: " + balance);
    }
}

public class A3HQ1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Account Number: ");
        int account_no = input.nextInt();
        System.out.print("Enter Name: ");
        String name = input.next();
        System.out.print("Enter Balance: ");
        double balance = input.nextDouble();
        input.close();

        try {
            if (balance <= 0) {
                throw new InvalidBalanceException("Balance cannot be less than 0");
            }
            Bank b = new Bank(account_no, name, balance);
            b.display();
        } catch (InvalidBalanceException e) {
            System.out.println(e);
        }
    }
}
