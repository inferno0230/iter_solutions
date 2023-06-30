package Sems2.Assignment_6;

import java.util.Scanner;

class Node {
    protected int info;
    protected Node next;

    public Node (int info) {
        this.info = info;
        this.next = null;
    }

    public static Node push(Node top) {
        Scanner ganyu=new Scanner(System.in);
        System.out.println("Enter the element to be pushed");
        int element=ganyu.nextInt();
        Node temp=new Node(element);
        if(isEmpty(top)) {
            top=temp;
        }
        else {
            temp.next=top;
            top=temp;
        }
        return top;
    }

    public static Node pop(Node top) {
        if(isEmpty(top)) {
            System.out.println("Stack underflow");
        }
        else {
            System.out.println("The popped element is "+top.info);
            top=top.next;
        }
        return top;
    }

    public static void display(Node top) {
        if(isEmpty(top)) {
            System.out.println("Stack is empty");
        }
        else {
            Node temp=top;
            while(temp!=null) {
                System.out.print(temp.info+" ");
                temp=temp.next;
            }
            System.out.println();
        }
    }

    // Make a boolean method to check if LL is empty or not
    // Makes life easy kk

    public static boolean isEmpty(Node top) {
        if(top==null) {
            return true;
        }
        else {
            return false;
        }
    }
}

public class A6P2 {

    public static void main(String[] args) {
        Scanner ganyu=new Scanner(System.in);
        Node top=null;
        boolean flag=true;
        while(flag) {
            System.out.println("\n****MENU****");
            System.out.println("0:Exit");
            System.out.println("1:Push");
            System.out.println("2:Pop");
            System.out.println("3:Display");
            System.out.println("4:Exit");
            System.out.print("Enter your choice: ");
            int choice=ganyu.nextInt();
            switch(choice) {
                case 0:
                    System.exit(0);
                    break;
                
                case 1:
                    top=push(top);
                    break;
    
                case 2:
                    top=pop(top);
                    break;

                case 3:
                    display(top);
                    break;
                case 4:
                    flag = false;
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Wrong choice");
                    break;
            }
        }
    }

    // I have no idea why question tells to call push and pop method statically but ok
    // That also from Node class ????????????????????????????????????????????????????
    public static Node push(Node top) {
        return Node.push(top);
    }

    public static Node pop(Node top) {
        return Node.pop(top);
    }

    public static void display(Node top) {
        Node.display(top);
    }
}