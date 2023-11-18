package Sems3.AD1.Assignment_7;

import java.util.Scanner;

public class A7Q6 {
    public static void main(String[] args) {
        LinkedList linkedlist = new LinkedList();
        linkedlist.append(1);
        linkedlist.append(10);
        linkedlist.append(5);
        linkedlist.append(2);
        linkedlist.append(1);
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the key: ");
        int key = input.nextInt();
        linkedlist.head = delWithKey(linkedlist.head, key);
        A7Q1.printList(linkedlist.head);
        System.out.println();
        input.close();
    }

    public static Node delWithKey(Node head, int key) {
        Node current = head;
        while (current != null && current.next.val != key) {
            current = current.next;
        }
        if (current != null) {
            current.next = current.next.next;
        }
        return head;
    }
}
