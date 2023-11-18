package Sems3.AD1.Assignment_7;

import java.util.Scanner;

public class A7Q3 {
    public static void main(String[] args) {
        LinkedList linkedlist = new LinkedList();
        linkedlist.append(1);
        linkedlist.append(10);
        linkedlist.append(5);
        linkedlist.append(2);
        linkedlist.append(1);
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the value to be inserted after the key: ");
        int val = input.nextInt();
        System.out.println("Enter the key: ");
        int key = input.nextInt();
        linkedlist.head = insAfterKey(linkedlist.head, key, val);
        A7Q1.printList(linkedlist.head);
        System.out.println();
        input.close();
    }

    public static Node insAfterKey(Node head, int key, int val) {
        Node current = head;
        while (current != null && current.val != key) {
            current = current.next;
        }
        if (current != null) {
            Node newNode = new Node(val);
            newNode.next = current.next;
            current.next = newNode;
        }
        return head;
    }
}
