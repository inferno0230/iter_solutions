package Sems2.Assignment_7;
import java.util.Scanner;

public class A7P1 {
    
    public static void insert(int Q[]) {
        Scanner input = new Scanner(System.in);
        if(is_full()) {
            System.out.println("Queue is full.");
        } else if(is_empty()) {
            front=0; 
            rear=0; 
            System.out.println("Enter the element to be inserted"); 
            int element=input.nextInt(); 
            Q[rear]=element; 
        } else {
            System.out.println("Enter the element to be inserted"); 
            int element=input.nextInt(); 
            rear++; 
            Q[rear]=element; 
        }
    }

    public static void delete(int Q[]) {
        if(is_empty()) {
            System.out.println("Queue is empty.");
        } else if(front==rear) {
            System.out.println("Deleted element is "+Q[front]); 
            front=-1; 
            rear=-1; 
        } else {
            System.out.println("Deleted element is "+Q[front]); 
            front++; 
        }
    }

    public static void display(int Q[]) {
        if(is_empty()) {
            System.out.println("Queue is empty.");
        } else {
            System.out.println("Queue elements are"); 
            for(int i=front;i<=rear;i++) {
                System.out.println(Q[i]); 
            }
        }
    }

    public static boolean is_full() {
        if(rear==MAX-1) {
            return true;
        }
        return false;
    }

    public static boolean is_empty() {
        if(front==-1 && rear==-1) {
            return true;
        }
        return false;
    }

    public static final int MAX=5; 
    public static int front=-1; 
    public static int rear=-1; 
    public static void main(String[]args) {
        Scanner sc=new Scanner(System.in); 
        int queue[]=new int[MAX]; 
        while(true) { 
            System.out.println("***MENU***"); 
            System.out.println("0: Exit"); 
            System.out.println("1: Insert"); 
            System.out.println("2: Delete"); 
            System.out.println("3: Display"); 
            System.out.println("Enter your choice"); 
            int choice=sc.nextInt(); 
            switch(choice) { 
                case 0:  
                    System.exit(0); 
                case 1:  
                    insert(queue); 
                    break; 
                case 2:
                    delete(queue); 
                    break;

                case 3:
                    display(queue); 
                    break;

                default: 
                    System.out.println("Invalid choice");
                
            }
        }
    }
}
