package Sems2.Assignment_4;
import java.util.Scanner;

class Node {
    protected int regd_no;
    protected float mark;
    protected Node next;

    Node() {
        regd_no = 0;
        mark = 0;
        next = null;
    }

    Node(int regd_no, float mark) {
        this.regd_no = regd_no;
        this.mark = mark;
        next = null;
    }

    Node(int regd_no, float mark, Node next) {
        this.regd_no = regd_no;
        this.mark = mark;
        this.next = next;
    }

    public String toString() {
        return "Regd_no: " + regd_no + ", Mark: " + mark;
    }

    public boolean equals(Node node) {
        return regd_no == node.regd_no && mark == node.mark;
    }

    public static Node create() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number of nodes: ");
        int n = input.nextInt();
        Node start = null;
        Node temp = null;
        for (int i = 0; i < n; i++) {
            System.out.print("Enter regd_no: ");
            int regd_no = input.nextInt();
            System.out.print("Enter mark: ");
            float mark = input.nextFloat();
            Node node = new Node(regd_no, mark);
            if (start == null) {
                start = node;
                temp = start;
            } else {
                temp.next = node;
                temp = temp.next;
            }
        }
        input.close();
        return start;
    }

    public static void display(Node start) {
        Node temp = start;
        while (temp != null) {
            System.out.println(temp);
            temp = temp.next;
        }
    }

    public static Node insBeg(Node start) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter regd_no: ");
        int regd_no = input.nextInt();
        System.out.print("Enter mark: ");
        float mark = input.nextFloat();
        Node node = new Node(regd_no, mark);
        node.next = start;
        input.close();
        return node;
    }

    public static Node insEnd(Node start) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter regd_no: ");
        int regd_no = input.nextInt();
        System.out.print("Enter mark: ");
        float mark = input.nextFloat();
        Node node = new Node(regd_no, mark);
        Node temp = start;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = node;
        input.close();
        return start;
    }

    public static Node insAny(Node start) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter regd_no: ");
        int regd_no = input.nextInt();
        System.out.print("Enter mark: ");
        float mark = input.nextFloat();
        Node node = new Node(regd_no, mark);
        System.out.print("Enter position: ");
        int pos = input.nextInt();
        Node temp = start;
        for (int i = 0; i < pos - 1; i++) {
            temp = temp.next;
        }
        node.next = temp.next;
        temp.next = node;
        input.close();
        return start;
    }

    public static Node delBeg(Node start) {
        return start.next;
    }

    public static Node delEnd(Node start) {
        Node temp = start;
        while (temp.next.next != null) {
            temp = temp.next;
        }
        temp.next = null;
        return start;
    }

    public static Node delAny(Node start) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter position: ");
        int pos = input.nextInt();
        Node temp = start;
        for (int i = 0; i < pos - 1; i++) {
            temp = temp.next;
        }
        temp.next = temp.next.next;
        input.close();
        return start;
    }

    public static void search(Node start) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter regd_no: ");
        int regd_no = input.nextInt();
        Node temp = start;
        while (temp != null) {
            if (temp.regd_no == regd_no) {
                System.out.print("Enter mark: ");
                float mark = input.nextFloat();
                temp.mark = mark;
                input.close();
                return;
            }
            temp = temp.next;
        }
        System.out.println("Node not found");
        input.close();
    }

    public static void sort(Node start) {
        Node temp = start;
        while (temp != null) {
            Node temp2 = temp.next;
            while (temp2 != null) {
                if (temp.regd_no > temp2.regd_no) {
                    int regd_no = temp.regd_no;
                    float mark = temp.mark;
                    temp.regd_no = temp2.regd_no;
                    temp.mark = temp2.mark;
                    temp2.regd_no = regd_no;
                    temp2.mark = mark;
                }
                temp2 = temp2.next;
            }
            temp = temp.next;
        }
    }
}

public class A4Q1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Node start = null;
        while (true) {
            System.out.println("1. Create");
            System.out.println("2. Display");
            System.out.println("3. Insert at beginning");
            System.out.println("4. Insert at end");
            System.out.println("5. Insert at any position");
            System.out.println("6. Delete at beginning");
            System.out.println("7. Delete at end");
            System.out.println("8. Delete at any position");
            System.out.println("9. Search");
            System.out.println("10. Sort");
            System.out.println("11. Exit");
            System.out.print("Enter choice: ");
            int choice = input.nextInt();
            switch (choice) {
                case 1:
                    start = Node.create();
                    break;
                case 2:
                    Node.display(start);
                    break;
                case 3:
                    start = Node.insBeg(start);
                    break;
                case 4:
                    start = Node.insEnd(start);
                    break;
                case 5:
                    start = Node.insAny(start);
                    break;
                case 6:
                    start = Node.delBeg(start);
                    break;
                case 7:
                    start = Node.delEnd(start);
                    break;
                case 8:
                    start = Node.delAny(start);
                    break;
                case 9:
                    Node.search(start);
                    break;
                case 10:
                    Node.sort(start);
                    break;
                case 11:
                    input.close();
                    System.exit(0);
                default:
                    System.out.println("Wrong choice");
            }
        }
    }
}



