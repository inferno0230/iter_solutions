package Sems3.AD1.Assignment_8;

import java.util.*;

public class A8Q5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an expression: ");
        String str = input.nextLine();
        input.close();
        System.out.println("Expression: " + str);
        if (isRedundant(str)) {
            System.out.println("No redundant brackets are present");
        } else {
            System.out.println("Yes, Redundant brackets are present");
        }
    }

    public static boolean isRedundant(String str) {
        Stack<Character> stack = new Stack<Character>();
        boolean flag = true;
       
        for (int i = 0;i < str.length();i++) {
            if(str.charAt(i) == '(' || str.charAt(i) == '[' || str.charAt(i) == '{') {
                stack.push(str.charAt(i));
            } else if (str.charAt(i) == ')' || str.charAt(i) == ']' || str.charAt(i) == '}') {
                if (str.charAt(i) == ')' && !stack.isEmpty() && stack.peek() == '(') {
                    stack.pop();
                } else if (str.charAt(i) == ']' && !stack.isEmpty() && stack.peek() == '[') {
                    stack.pop();
                } else if (str.charAt(i) == '}' && !stack.isEmpty() && stack.peek() == '{') {
                    stack.pop();
                } else {
                    flag = false;
                    break;
                }
            } else {
                continue;
            }
        }
        return flag;
    }
}
