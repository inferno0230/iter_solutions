package Sems3.AD1.Assignment_7;

public class A7Q5 {
    public static void main(String[] args) {
        LinkedList linkedlist = new LinkedList();
        linkedlist.append(1);
        linkedlist.append(10);
        linkedlist.append(5);
        linkedlist.append(2);
        linkedlist.append(1);
        System.out.println("Before deletion: ");
        A7Q1.printList(linkedlist.head);
        linkedlist.head = delBegin(linkedlist.head);
        System.out.println("\nAfter deletion: ");
        A7Q1.printList(linkedlist.head);
        System.out.println();
    }

    public static Node delBegin(Node head) {
        if (head != null) {
            head = head.next;
        }
        return head;
    }
}
