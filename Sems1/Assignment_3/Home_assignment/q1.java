package Sems1.Assignment_3.Home_assignment;
/* Write a java program that plays the popular scissor-rock-paper game. (A scissor can cut
a paper, a rock can knock a scissor, and a paper can wrap a rock.) The program
randomly generates a number 0, 1, or 2 representing scissor, rock, and paper. The
program prompts the user to enter a number 0, 1, or 2 and displays a message indicating
whether the user or the computer wins, loses, or draws.
Here are sample runs:
scissor (0), rock (1), paper (2): 1
The computer is scissor. You are rock. You won
scissor (0), rock (1), paper (2): 2
The computer is paper. You are paper too. It is a draw */

import java.util.Scanner;
import java.util.Random;

public class q1 {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    Random rand = new Random();
    System.out.println("scissor (0), rock (1), paper (2):");
    int user = scan.nextInt();
    int computer = rand.nextInt(3);
    
    String userChoice;
    switch (user) {
      case 0:
        userChoice = "scissor";
        break;
      case 1:
        userChoice = "rock";
        break;
      default:
        userChoice = "paper";
    }
    
    String computerChoice;
    switch (computer) {
      case 0:
        computerChoice = "scissor";
        break;
      case 1:
        computerChoice = "rock";
        break;
      default:
        computerChoice = "paper";
    }
    
    System.out.print("The computer is " + computerChoice + ". You are " + userChoice + ". ");
    if (user == computer) {
      System.out.println("It is a draw.");
    } else if (user == 0 && computer == 2 || user == 1 && computer == 0 || user == 2 && computer == 1) {
      System.out.println("You won.");
    } else {
      System.out.println("You lost.");
    }
    scan.close();
  }
}

