package Sems2.Assignment_7;
import java.util.Scanner;

class Node {
    protected int data;
    protected Node next;
    
    protected Node(int data) {
        this.data=data;
        this.next=null;
    }
}

class queue {
    private static Scanner input = new Scanner(System.in);
    private static Node head=null;
    private static Node tail=null;

    public static boolean isEmpty() {
        if(head==null && tail==null) {
            return true;
        }
        return false;
    }

    public static void enqueue(int data) {
        Node temp = new Node(data);
        if(isEmpty()) {
            head=tail=temp;
            return;
        } else {
            tail.next=temp;
            tail=temp;
            return;
        }
    }

    public static void dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is empty.");
        } else if (head == tail) {
            head = tail = null;
        } else {
            head = head.next;
        }
    }
    public static void display() {
    Node current = head;
    while (current != null) {
        System.out.println(current.data);
        current = current.next;
    }
}

}

public class A1P2 {
    public static void main(String[]args) {
        queue q = new queue();

        q.enqueue(0);
        q.enqueue(1);
        q.enqueue(2);
        q.enqueue(3);
        q.display();
        q.dequeue();
        q.display();
    }
}
