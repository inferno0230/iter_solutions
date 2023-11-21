package Sems3.AD1.Assignment_7;

public class A7Q7 {
    public static void main(String[] args) {
        LinkedList linkedlist = new LinkedList();
        int inp[] = {1, 10, 5, 2, 7};
        for (int i = 0; i < inp.length; i++) linkedlist.append(inp[i]);
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