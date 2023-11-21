package Sems3.AD1.Assignment_7;

public class A7Q5 {
    public static void main(String[] args) {
        LinkedList linkedlist = new LinkedList();
        int inp[] = {1, 10, 5, 2, 7};
        for (int i = 0; i < inp.length; i++) linkedlist.append(inp[i]);
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
