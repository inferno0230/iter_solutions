package Sems3.AD1.Assignment_7;

import java.util.Scanner;

class Node {
    int val;
    Node next;
    
    Node(int val,Node next) {
        val = this.val;
        next = this.next;
    }

    Node(int val) {
        val = this.val;
        next = null;
    }
    
    static Scanner inputNode = new Scanner(System.in);
    public static Node create() {
        System.out.print("Enter number of nodes: ");
        int n = inputNode.nextInt();
        Node start = null;
        Node temp = null;
        for (int i = 0; i < n; i++) {
            System.out.print("Enter regd_no: ");
            int integer = inputNode.nextInt();
            Node node = new Node(integer);
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

    public static Node insertAt(Node start,int key) {
        Node tempStart = start;
        while(tempStart != null) {
            if(tempStart.val == key) {
                System.out.print("Enter value to insert: ");
                Node insert = new Node(inputNode.nextInt());
                tempStart.next = insert;
            } else {
                tempStart = tempStart.next;
            }
        }
        return tempStart;
    }
}

public class A7Q1 {
    public static void main(String[] args) {
        Scanner input
        Node start = null;
        
    }
}
