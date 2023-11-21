package Sems3.AD1.Assignment_7;

import java.util.Scanner;

public class A7Q2 {
    public static void main(String[] args) {
        LinkedList linkedlist = new LinkedList();
        int inp[] = {1, 10, 5, 2, 7};
        for (int i = 0; i < inp.length; i++) linkedlist.append(inp[i]);
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the value to be inserted at the beginning of the list: ");
        int val = input.nextInt();
        linkedlist.head = insBegin(linkedlist.head, val);
        A7Q1.printList(linkedlist.head);
        System.out.println();
        input.close();
    }

    public static Node insBegin(Node head, int val) {
        Node newNode = new Node(val);
        newNode.next = head;
        head = newNode;
        return head;
    }
}