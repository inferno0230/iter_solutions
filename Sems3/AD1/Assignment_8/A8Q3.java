package Sems3.AD1.Assignment_8;

import java.util.Scanner;
import java.util.Stack;
public class A8Q3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a substring with Parenthesis");
        String inputtedString = input.nextLine();
        char charArr[] = inputtedString.toCharArray();
        Stack <Character>stack = new Stack<>();
        boolean check = true;
        for (char ch : charArr) {
            if (ch == '(' || ch == '[' || ch == '{') {
                stack.push(ch);
            } else if (ch == ')' && !stack.isEmpty() && stack.peek() == '(') {
                stack.pop();
            } else if (ch == ']' && !stack.isEmpty() && stack.peek() == '[') {
                stack.pop();
            } else if (ch == '}' && !stack.isEmpty() && stack.peek() == '{') {
                stack.pop();
            } else {
                check = false; 
            }
            //System.out.println(check); //Debug
        }

        if(check){
            System.out.println("The String you entered passes checks.");
        } else {
            System.out.println("The String you entered failed checks.");
        }
    }
}
