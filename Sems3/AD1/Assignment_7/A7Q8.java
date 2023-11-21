package Sems3.AD1.Assignment_7;

public class A7Q8 {
    public static void main(String[] args) {
        LinkedList linkedlist = new LinkedList();
        int inp[] = {1, 10, 5, 2, 7};
        for (int i = 0; i < inp.length; i++) linkedlist.append(inp[i]);
        System.out.println("Before reversal: ");
        A7Q1.printList(linkedlist.head);
        linkedlist.head = reverseList(linkedlist.head);
        System.out.println("\nAfter reversal: ");
        A7Q1.printList(linkedlist.head);
        System.out.println();
    }

    public static Node reverseList(Node head) {
        Node current = head;
        Node prev = null;
        Node next = null;
        while (current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        head = prev;
        return head;
    }
}
