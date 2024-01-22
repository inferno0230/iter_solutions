package Sems3.AD1.Assignment_9;

import java.util.*;

class queue_2 { // Keeping class name different from A9Q1 to avoid conflict
    Stack<Integer> s1 = new Stack<Integer>();
    Stack<Integer> s2 = new Stack<Integer>();

    void enqueue(int x) {
        while (!s1.isEmpty()) {
            s2.push(s1.pop());
        }
        s1.push(x);
        while (!s2.isEmpty()) {
            s1.push(s2.pop());
        }
    }

    void dequeue() {
        if (s1.isEmpty() && s2.isEmpty()) {
            System.out.println("Queue is empty");
        } else {
            System.out.println("Dequeued element: " + s1.pop());
        }
    }

    void display() {
        if (s1.isEmpty()) {
            System.out.println("Queue is empty");
        }
        System.out.println("Elements in the queue are: ");
        for (int i = s1.size() - 1; i >= 0; i--) {
            System.out.println(s1.get(i));
        }
    }
}


public class A9Q2 {
    public static void main(String[] args) {
        System.out.print("\033[H\033[2J"); // Clear terminal
        queue_2 q = new queue_2();
        Scanner input = new Scanner(System.in);
        while(true) {
            System.out.println("***MENU***");
            System.out.println("0. Display");
            System.out.println("1. Enqueue");
            System.out.println("2. Dequeue");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            int choice = input.nextInt();
            switch (choice) {
                case 0:
                    System.out.print("\033[H\033[2J");
                    q.display();
                    break;
                case 1:
                    System.out.print("\033[H\033[2J");
                    System.out.print("Enter the element to be inserted: ");
                    int x = input.nextInt();
                    q.enqueue(x);
                    break;
                case 2:
                    System.out.print("\033[H\033[2J");
                    q.dequeue();
                    break;
                case 3:
                    System.out.print("\033[H\033[2J");
                    input.close(); // Kill the Scanner object before exiting
                    System.exit(0);
                default:
                    System.out.println("Invalid choice");
                    break;
            }
        }
    }
}
