package Sems2.Assignment_3;

public class A3Q4 {
    public static <E> void printArray(E[] inputArray) {
        for (E element : inputArray) {
            System.out.println(element);
        }
    }

    public static void main(String[] args) {
        Integer[] integerArray = {1, 2, 3, 4, 5};
        String[] stringArray = {"Hello", "World"};
        Double[] doubleArray = {1.5, 2.5, 3.5};

        System.out.println("Printing integerArray:");
        printArray(integerArray);

        System.out.println("Printing stringArray:");
        printArray(stringArray);

        System.out.println("Printing doubleArray:");
        printArray(doubleArray);
    }
}

