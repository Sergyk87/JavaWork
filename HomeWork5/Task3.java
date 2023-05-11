// Реализовать алгоритм пирамидальной сортировки (HeapSort).
package HomeWork5;

import java.util.Arrays;

public class Task3 {
    public static void main(String args[]) {
        int[] Array = new int[] { 1, 5, 8, 9, 6, 12, 54, 78, 3, 15, 66, 5 };
        heapSort(Array, Array.length);
    }

    public static void heapSort(int[] Array, int length) {
        int temp;
        int size = length - 1;
        for (int i = (length / 2); i >= 0; i--) {
            heapify(Array, i, size);
        }
        ;
        for (int i = size; i >= 0; i--) {
            temp = Array[0];
            Array[0] = Array[size];
            Array[size] = temp;
            size--;
            heapify(Array, 0, size);
        }
        System.out.println(Arrays.toString(Array));
    }

    public static void heapify(int[] Array, int i, int heapSize) {
        int a = 2 * i;
        int b = 2 * i + 1;
        int largestElement;
        if (a <= heapSize && Array[a] > Array[i]) {
            largestElement = a;
        } else {
            largestElement = i;
        }
        if (b <= heapSize && Array[b] > Array[largestElement]) {
            largestElement = b;
        }
        if (largestElement != i) {
            int temp = Array[i];
            Array[i] = Array[largestElement];
            Array[largestElement] = temp;
            heapify(Array, largestElement, heapSize);
        }
    }
}
