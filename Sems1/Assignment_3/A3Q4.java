/* Make a simple game involving a computer and a user. The computer first guesses a
number between 1 and 9 inclusive, then ask the user to enter a number between 1 and
9 inclusive. If the user guess is correct then display “You got it right”, if the guess is
close (+1, -1) “Almost got it “, Otherwise “You got it wrong”.
Here are some sample runs.
Enter user number: 2
Computer guesses: 3
“Almost got it”
Enter user number: 4
Computer guesses: 4
“You got it right”
Enter user number: 1
Computer guesses: 5
“You got it wrong” */


import java.util.Scanner;
public class A3Q4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter user number: ");
        int userGuess = scan.nextInt();
        scan.close();

        int computerGuess = (int)((Math.random()*9)+1);
        System.out.println(computerGuess);

        if (userGuess == computerGuess) {
            System.out.println("You got it right");
        } else if ((userGuess == computerGuess + 1) || (userGuess == computerGuess - 1)) {
            System.out.println("Almost got it");
        } else {
            System.out.println("You got it wrong");
        }
        scan.close();
    }
}