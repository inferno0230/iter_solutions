package Sems3.AD1.Assignment_8;

import java.util.Scanner;

public class A8P1 {
    public static int push(int S[], int top) {
        Scanner input = new Scanner(System.in);
        if (isFull(top)) {
            System.out.println("Overflow");
        } else {
            top += 1;
            System.out.println("Enter element to push into stack");
            S[top] = input.nextInt();
        }
        return top;
    }

    public static int pop(int S[], int top) {
        if (isEmpty(top)) {
            System.out.println("Underflow");
        } else {
            System.out.println("Popped element: " + S[top]);
            top -= 1;
        }
        return top;
    }

    public static void display(int S[], int top) {
        if (isEmpty(top)) {
            System.out.println("Stack is empty");
        } else {
            System.out.println("Stack elements:");
            for (int i = top; i >= 0; i--) {
                System.out.println(S[i]);
            }
        }
    }

    public static boolean isEmpty(int top) {
        return top == -1;
    }

    public static boolean isFull(int top) {
        return top >= MAX_SIZE - 1;
    }

    public static final int MAX_SIZE = 5;

    public static void main(String[] args) {
        int S[] = new int[MAX_SIZE];
        Scanner menu = new Scanner(System.in);
        int top = -1;
        while (true) {
            System.out.println("***MENU***");
            System.out.println("0: Exit");
            System.out.println("1: Push");
            System.out.println("2: Pop");
            System.out.println("3: Display");
            System.out.println("Enter your choice: ");
            int choice = menu.nextInt();
            switch (choice) {
                case 0:
                    System.exit(0);
                    break;

                case 1:
                    top = push(S, top);
                    break;

                case 2:
                    top = pop(S, top);
                    break;
                case 3:
                    display(S, top);
                    break;

                default:
                    System.out.println("Invalid input, please enter a valid choice.");
            }
        }
    }
}
