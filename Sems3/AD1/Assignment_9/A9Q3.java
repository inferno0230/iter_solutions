package Sems3.AD1.Assignment_9;

import java.util.*;

class queue_3 {
    int MAX = 5;
    int front = -1;
    int rear = -1;
    int Q[] = new int[MAX];

    void enqueue(int x) {
        if (is_full()) {
            System.out.println("Queue is full");
        } else if (is_empty()) {
            front = 0;
            rear = 0;
            Q[rear] = x;
        } else {
            rear = (rear + 1) % MAX;
            Q[rear] = x;
        }
    }

    void dequeue() {
        if (is_empty()) {
            System.out.println("Queue is empty");
        } else if (front == rear) {
            System.out.println("Dequeued element: " + Q[front]);
            front = -1;
            rear = -1;
        } else {
            System.out.println("Dequeued element: " + Q[front]);
            front = (front + 1) % MAX;
        }
    }

    void display() {
        if (is_empty()) {
            System.out.println("Queue is empty");
        } else {
            System.out.println("Elements in the queue are: ");
            for (int i = front; i != rear; i = (i + 1) % MAX) {
                System.out.println(Q[i]);
            }
            System.out.println(Q[rear]);
        }
    }

    boolean is_full() {
        if ((rear + 1) % MAX == front) {
            return true;
        }
        return false;
    }

    boolean is_empty() {
        if (front == -1 && rear == -1) {
            return true;
        }
        return false;
    }
}

public class A9Q3 {
    public static void main(String[] args) {
        System.out.println("\033[H\033[2J"); // Clear terminal
        queue_3 q = new queue_3();
        Scanner input = new Scanner(System.in);
        while (true) {
            System.out.println("***MENU***");
            System.out.println("0. Display");
            System.out.println("1. Enqueue");
            System.out.println("2. Dequeue");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            int choice = input.nextInt();
            switch (choice) {
                case 0:
                    System.out.println("\033[H\033[2J");
                    q.display();
                    break;
                case 1:
                    System.out.println("\033[H\033[2J");
                    System.out.print("Enter the element to be inserted: ");
                    int x = input.nextInt();
                    q.enqueue(x);
                    break;
                case 2:
                    System.out.println("\033[H\033[2J");
                    q.dequeue();
                    break;
                case 3:
                    System.out.println("\033[H\033[2J");
                    System.out.println("Exiting...");
                    System.exit(0);
                    break;
                default:
                    System.out.println("\033[H\033[2J");
                    System.out.println("Invalid choice");
                    break;
            }
        }
    }
}
