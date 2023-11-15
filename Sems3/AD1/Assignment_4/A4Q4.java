public class A4Q4 {
    public static void main(String[] args) {
        int[] array1 = {1, 3, 5, 7};
        int[] array2 = {2, 4, 6, 8, 10};
        int[] mergedArray = mergeSortedArrays(array1, array2);
        System.out.println("Merged Sorted Array:");
        for (int element : mergedArray) {
            System.out.print(element + " ");
        }
    }

    public static int[] mergeSortedArrays(int[] array1, int[] array2) {
        int length1 = array1.length;
        int length2 = array2.length;
        int[] mergedArray = new int[length1 + length2];
        
        int i = 0, j = 0, k = 0;
        
        while (i < length1 && j < length2) {
            if (array1[i] <= array2[j]) {
                mergedArray[k] = array1[i];
                i++;
            } else {
                mergedArray[k] = array2[j];
                j++;
            }
            k++;
        }
        
        while (i < length1) {
            mergedArray[k] = array1[i];
            i++;
            k++;
        }
        while (j < length2) {
            mergedArray[k] = array2[j];
            j++;
            k++;
        }
        return mergedArray;
    }
}
