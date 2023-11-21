package Sems3.AD1.Assignment_7;

import java.util.Scanner;

public class A7Q6 {
    public static void main(String[] args) {
        LinkedList linkedlist = new LinkedList();
        int inp[] = {1, 10, 5, 2, 7};
        for (int i = 0; i < inp.length; i++) linkedlist.append(inp[i]);
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
