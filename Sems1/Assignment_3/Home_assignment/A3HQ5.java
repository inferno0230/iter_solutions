/* Write a java program which displays an appropriate name for a person, using a combination of nested ifs and compound conditions. Ask the user for a gender, first
name, last name and age. If the person is female and 20 or over, ask if she is married.
If so, display "Mrs." in front of her name. If not, display "Ms." in front of her name. If
the female is under 20, display her first and last name. If the person is male and 20 or
over, display "Mr." in front of his name. Otherwise, display his first and last name. Note
that asking a person if they are married should only be done if they are female and 20
or older, which means you will have a single if and else nested inside one of your if
statements. Also, did you know that with an if statements (or else), the curly braces are
optional when there is only one statement inside?
What is your gender (M or F): F
First name: Gita
Last name: Pattanayak
Age: 32
Are you married, Gita (y or n)? y
Then I shall call you Mrs. Gita Pattanayak.
What is your gender (M or F): F
First name: Anjali
Last name: Mishra
Age: 48
Are you married, Anjali (y or n)? n
Then I shall call you Ms. Anjali.
What is your gender (M or F): M
First name: Ashok
Last name: MohantyAge: 23
Then I shall call you Mr. Ashok.
What is your gender (M or F): M
First name: Rahul
Last name: Pati
Age: 15
Then I shall call you Rahul Pati */

import java.util.Scanner;
public class A3HQ5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("What is your gender (M or F): ");
        char gender = sc.next().charAt(0);

        System.out.print("First name: ");
        String firstName = sc.next();

        System.out.print("Last name: ");
        String lastName = sc.next();

        System.out.print("Age: ");
        int age = sc.nextInt();

        if (gender == 'F') {
            if (age >= 20) {
                System.out.print("Are you married, " + firstName + " (y or n)? ");
                char married = sc.next().charAt(0);
                if (married == 'y') {
                    System.out.println("Then I shall call you Mrs. " + firstName + " " + lastName + ".");
                } else {
                    System.out.println("Then I shall call you Ms. " + firstName + " " + lastName + ".");
                }
            } else {
                System.out.println("Then I shall call you " + firstName + " " + lastName + ".");
            }
        } else {
            if (age >= 20) {
                System.out.println("Then I shall call you Mr. " + firstName + " " + lastName + ".");
            } else {
                System.out.println("Then I shall call you " + firstName + " " + lastName + ".");
            }
        }
        sc.close();
    }
}



