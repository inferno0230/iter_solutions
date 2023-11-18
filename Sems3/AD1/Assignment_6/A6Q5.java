package Sems3.AD1.Assignment_6;

import java.util.Scanner;

class Node {
    char data;
    Node next;
    
    Node(char data) {
        this.data = data;
        this.next = null;
    }
}

class LinkedList {
    Node head;
    void append(char data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
    }
}

public class A6Q5 {

    private static char[][] getUserInput() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of lists in the adjacency list: ");
        int numLists = scanner.nextInt();

        char[][] adjacencyList = new char[numLists][];
        scanner.nextLine();

        for (int i = 0; i < numLists; i++) {
            System.out.print("Enter elements for list " + (i + 1) + " separated by spaces: ");
            String input = scanner.nextLine();
            adjacencyList[i] = input.replaceAll("\\s", "").toCharArray();
        }

        return adjacencyList;
    }

    private static void findRepeatedElements(char[][] adjacencyList) {
        LinkedList linkedList = flattenAdjacencyList(adjacencyList);

        int[] counts = new int[256];

        Node current = linkedList.head;
        while (current != null) {
            counts[current.data]++;
            current = current.next;
        }

        System.out.println("Repeated Elements and their Counts:");
        for (int i = 0; i < counts.length; i++) {
            if (counts[i] > 1) {
                System.out.println((char) i + ": " + counts[i] + " times");
            }
        }
    }

    private static LinkedList flattenAdjacencyList(char[][] adjacencyList) {
        LinkedList linkedList = new LinkedList();
        for (char[] sublist : adjacencyList) {
            for (char element : sublist) {
                linkedList.append(element);
            }
        }
        return linkedList;
    }

    public static void main(String[] args) {
        char[][] adjacencyList = getUserInput();
        findRepeatedElements(adjacencyList);
    }   
}
