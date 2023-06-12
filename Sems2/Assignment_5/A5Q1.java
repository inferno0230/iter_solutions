package Sems2.Assignment_5;

import java.util.Scanner;

class Node {
    protected int regd_no;
    protected float mark;
    protected Node next;
    protected Node prev;

    public static Node create() {
        Scanner input = new Scanner(System.in);
        Node start = null;
        Node end = null;
        while (true) {
            System.out.print("Enter regd_no: ");
            int regd_no = input.nextInt();
            System.out.print("Enter mark: ");
            float mark = input.nextFloat();
            Node temp = new Node();
            temp.regd_no = regd_no;
            temp.mark = mark;
            if (start == null) {
                start = temp;
                end = temp;
            } else {
                end.next = temp;
                temp.prev = end;
                end = temp;
            }
            System.out.print("Do you want to continue (y/n): ");
            char ch = input.next().charAt(0);
            if (ch == 'n' || ch == 'N') {
                break;
            }
        }
        return start;
    }

    public static void display(Node start) {
        Node temp = start;
        while (temp != null) {
            System.out.println("Regd_no: " + temp.regd_no);
            System.out.println("Mark: " + temp.mark);
            temp = temp.next;
        }
    }

    public static Node insBeg(Node start) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter regd_no: ");
        int regd_no = input.nextInt();
        System.out.print("Enter mark: ");
        float mark = input.nextFloat();
        Node temp = new Node();
        temp.regd_no = regd_no;
        temp.mark = mark;
        temp.next = start;
        start.prev = temp;
        start = temp;
        return start;
    }

    public static Node insEnd(Node start) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter regd_no: ");
        int regd_no = input.nextInt();
        System.out.print("Enter mark: ");
        float mark = input.nextFloat();
        Node temp = new Node();
        temp.regd_no = regd_no;
        temp.mark = mark;
        Node end = start;
        while (end.next != null) {
            end = end.next;
        }
        end.next = temp;
        temp.prev = end;
        return start;
    }

    public static Node insAny(Node start) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter regd_no: ");
        int regd_no = input.nextInt();
        System.out.print("Enter mark: ");
        float mark = input.nextFloat();
        Node temp = new Node();
        temp.regd_no = regd_no;
        temp.mark = mark;
        System.out.print("Enter position: ");
        int pos = input.nextInt();
        Node curr = start;
        for (int i = 1; i < pos - 1; i++) {
            curr = curr.next;
        }
        temp.next = curr.next;
        curr.next.prev = temp;
        curr.next = temp;
        temp.prev = curr;
        return start;
    }

    public static Node delBeg(Node start) {
        start = start.next;
        start.prev = null;
        return start;
    }

    public static Node delEnd(Node start) {
        Node end = start;
        while (end.next != null) {
            end = end.next;
        }
        end.prev.next = null;
        return start;
    }

    public static Node delAny(Node start) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter position: ");
        int pos = input.nextInt();
        Node curr = start;
        for (int i = 1; i < pos - 1; i++) {
            curr = curr.next;
        }
        curr.next = curr.next.next;
        curr.next.prev = curr;
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
                return;
            }
            temp = temp.next;
        }
        System.out.println("Node not found");
    }
}

public class A5Q1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Node start = null;
        Node end = null;
        while (true) {
            System.out.println("****MENU*****");
            System.out.println("0: Exit");
            System.out.println("1: Creation");
            System.out.println("2: Display");
            System.out.println("3: Insert at beginning");
            System.out.println("4: Insert at end");
            System.out.println("5: Insert at any position");
            System.out.println("6: Delete at beginning");
            System.out.println("7: Delete at end");
            System.out.println("8: Delete at any position");
            System.out.println("9: Search");
            System.out.println("Enter your choice");
            int choice = input.nextInt();
            switch (choice) {
                case 0:
                    System.exit(0);
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
                default:
                    System.out.println("Wrong choice");
            }
        }
    }
}


    
