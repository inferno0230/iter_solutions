package Sems3.AD1.Assignment_7;

import java.util.Scanner;

public class A7Q4 {
    public static void main(String[] args) {
        LinkedList linkedlist = new LinkedList();
        int inp[] = {1, 10, 5, 2, 7};
        for (int i = 0; i < inp.length; i++) linkedlist.append(inp[i]);
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the value to be inserted at the end of the list: ");
        int val = input.nextInt();
        linkedlist.head = insEnd(linkedlist.head, val);
        A7Q1.printList(linkedlist.head);
        System.out.println();
        input.close();
    }

    public static Node insEnd(Node head, int val) {
        Node current = head;
        while (current.next != null) {
            current = current.next;
        }
        Node newNode = new Node(val);
        current.next = newNode;
        return head;
    }
}
