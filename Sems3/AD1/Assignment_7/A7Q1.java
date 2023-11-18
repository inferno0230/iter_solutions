package Sems3.AD1.Assignment_7;

import java.util.Scanner;

class Node {
    int val;
    Node next;
    Node(int val) {
        this.val = val;
        this.next = null;
    }
}

class LinkedList {
    Node head;

    void append(int val) {
        Node newNode = new Node(val);
        if (head == null) {
            head = newNode;
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
    }
}

public class A7Q1 {
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Enter numbers of linked list with spaces in b/w: ");
        String[] numbers = input.nextLine().split(" ");
        LinkedList linkedList = new LinkedList();
        for (String number : numbers) {
            linkedList.append(Integer.parseInt(number));
        }
        printList(linkedList.head);
        input.close();
    }

    public static void printList(Node head) {
        Node current = head;
        while (current != null) {
            System.out.print(current.val + " ");
            current = current.next;
        }
    }
}