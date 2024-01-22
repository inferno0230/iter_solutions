package Sems3.AD1.Assignment_8;

import java.util.*;

public class A8Q4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a string to reverse: ");
        String str = input.nextLine();
        input.close();
        System.out.println("Original string: " + str);
        System.out.println("Reversed string: " + reverse(str));
    }

    public static String reverse(String str) {
        Stack<Character> stack = new Stack<Character>();
        for (int i = 0; i < str.length(); i++) {
            stack.push(str.charAt(i));
        }
        String rev = "";
        while (!stack.isEmpty()) {
            rev += stack.pop();
        }
        return rev;
    }
}
