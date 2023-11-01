public class q1 {
    public static void main(String[] args) {
        int[] array = {100, 50, 5, 60, 30, 1, 3, 70};
        int index = 2;
        maxHeapify(array, index);
        boolean isMaxHeap = isMaxHeap(array);
        System.out.println("Is it a Max Heap? " + isMaxHeap);
    }

    public static void maxHeapify(int[] array, int index) {
        int largest = index;
        int left = 2 * index + 1;
        int right = 2 * index + 2;
        if (left < array.length && array[left] > array[largest]) {
            largest = left;
        }
        if (right < array.length && array[right] > array[largest]) {
            largest = right;
        }
        if (largest != index) {
            int temp = array[index];
            array[index] = array[largest];
            array[largest] = temp;
            maxHeapify(array, largest);
        }
    }

    public static boolean isMaxHeap(int[] array) {
        for (int i = 0; i < array.length; i++) {
            int left = 2 * i + 1;
            int right = 2 * i + 2;
            if (left < array.length && array[left] > array[i]) {
                return false;
            }
            if (right < array.length && array[right] > array[i]) {
                return false;
            }
        }
        return true;
    }
}
