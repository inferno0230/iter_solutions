package Sems3.AD1.Assignment_7;

public class A7Q7 {
    public static void main(String[] args) {
        LinkedList linkedlist = new LinkedList();
        linkedlist.append(1);
        linkedlist.append(10);
        linkedlist.append(5);
        linkedlist.append(2);
        linkedlist.append(1);
        System.out.println("Before deletion: ");
        A7Q1.printList(linkedlist.head);
        linkedlist.head = delLast(linkedlist.head);
        System.out.println("\nAfter deletion: ");
        A7Q1.printList(linkedlist.head);
        System.out.println();
    }

    public static Node delLast(Node head) {
        Node current = head;
        while (current.next.next != null) {
            current = current.next;
        }
        current.next = null;
        return head;
    }
}