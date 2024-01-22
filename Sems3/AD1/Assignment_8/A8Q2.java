package Sems3.AD1.Assignment_8;

import java.util.Scanner;
public class A8Q2 {
    static Scanner input = new Scanner(System.in);
    public static int MAX_SIZE = 10;
    public static int ARR_1P = -1;
    public static int ARR_2P = 10;

    public static int[] push1(int stack[]) {
        if(isFull(1)) {
            System.out.println("Stack 1 is Overflowing...");
        } else {
            ARR_1P++;
            System.out.print("Enter element to push into stack: ");
            stack[ARR_1P] = input.nextInt();
            System.out.println();
        }
        return stack;
    }

    public static int[] push2(int stack[]) {
        if(isFull(2)) {
            System.out.println("Stack 2 is Overflowing...");
        } else {
            ARR_2P --;
            System.out.print("Enter element to push into stack: ");
            stack[ARR_2P] = input.nextInt();
            System.out.println();
        }
        return stack;
    }

    public static int[] pop1(int stack[]) {
        if(isEmpty(1)) {
            System.out.println("Stack is Empty");
        } else {
            stack[ARR_1P] = 0;
            ARR_1P--;
        }
        return stack;
    }

    public static int[] pop2(int stack[]) {
        if(isEmpty(2)) {
            System.out.println("Stack is Empty");
        } else {
            stack[ARR_2P] = 0;
            ARR_2P++;
        }
        return stack;
    }

    

    public static boolean isEmpty(int id) {
        if(id == 1) return ARR_1P == -1;
        return ARR_2P == 10;
    }

    public static boolean isFull(int id) {
        if(id == 1) return (ARR_1P == ARR_2P - 1) && ARR_1P <= 9;
        return (ARR_2P == ARR_1P + 1) && ARR_2P >= 0;
         
    }

    public static void display1(int stack[]) {
        if(isEmpty(1)) System.out.println("Stack is Empty");
        else {
            int temp = ARR_1P;
            while(temp >= 0) {
                System.out.println(stack[temp]);
                temp--;
            }
        }
    }

    public static void display2(int stack[]) {
        if(isEmpty(2)) System.out.println("Stack is Empty");
        else {
            int temp = ARR_2P;
            while(temp < 10) {
                System.out.println(stack[temp]);
                temp++;
            }
        }
    }

    public static void main(String[] args) {
        int stack[] = new int[MAX_SIZE];
        while(true) {
            System.out.println("***MENU***");
            System.out.println("0: Exit");
            System.out.println("1: Push to first stack");
            System.out.println("2: Pop from first stack");
            System.out.println("3: Push to second stack");
            System.out.println("4: Pop from second stack");
            System.out.println("5: Display first stack");
            System.out.println("6: Display second stack");
            System.out.print("Enter your choice: ");
            int choice = input.nextInt();
            System.out.println();

            switch(choice) {
                case 0:
                    System.exit(1);
                case 1:
                    push1(stack);
                    System.out.println();
                    break;
                case 2:
                    pop1(stack);
                    System.out.println();
                    break;
                case 3:
                    push2(stack);
                    System.out.println();
                    break;
                case 4:
                    pop2(stack);
                    System.out.println();
                    break;
                case 5:
                    display1(stack);
                    System.out.println();
                    break;
                case 6:
                    display2(stack);
                    System.out.println();
                    break;
                default:
                    System.out.println("Invalid option, Retry.....");
                    System.out.println();
                    break;
            }
        }
    }
}
