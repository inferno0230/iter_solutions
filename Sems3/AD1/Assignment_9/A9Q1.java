package Sems3.AD1.Assignment_9;

import java.util.*;

class queue {
    int front = -1, rear = -1;
    final int MAX_Q_SIZE = 6; // Maximum size of Queue
    int queue[] = new int[MAX_Q_SIZE];

    void enqueue(int data) {
        if (isFull()) {
            System.out.println("Queue is full");
        } else {
            if (front == -1) {
                front = 0;
            }
            rear += 1;
            queue[rear] = data;
        }
    }

    void dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
        } else {
            System.out.println("Dequeued element: " + queue[front]);
            front += 1;
        }
    }

    boolean isEmpty() {
        return front == -1;
    }

    boolean isFull() {
        return rear >= MAX_Q_SIZE - 1;
    }

    void display() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
        } else {
            System.out.println("Queue elements:");
            for (int i = front; i <= rear; i++) {
                System.out.println(queue[i]);
            }
        }
    }

}

public class A9Q1 {
    public static void main(String[] args) {
        System.out.print("\033[H\033[2J"); // Clear terminal
        Scanner input = new Scanner(System.in);
        queue q = new queue();
        while (true) {
            System.out.println("***MENU***");
            System.out.println("0: Exit");
            System.out.println("1: Enqueue");
            System.out.println("2: Dequeue");
            System.out.println("3: Display");
            System.out.print("Enter your choice: ");
            int choice = input.nextInt();
            switch (choice) {
                case 0:
                    System.out.print("\033[H\033[2J");
                    input.close(); // Kill the Scanner object before exiting
                    System.exit(0);
                    break;
                case 1:
                    System.out.print("\033[H\033[2J");
                    System.out.print("Enter element to enqueue: ");
                    int data = input.nextInt();
                    q.enqueue(data);
                    break;
                case 2:
                    System.out.print("\033[H\033[2J");
                    q.dequeue();
                    break;
                case 3:
                    System.out.print("\033[H\033[2J");
                    q.display();
                    break;
                default:
                    System.out.print("\033[H\033[2J");
                    System.out.println("Invalid choice");
                    break;
            }
        }
    }
}
