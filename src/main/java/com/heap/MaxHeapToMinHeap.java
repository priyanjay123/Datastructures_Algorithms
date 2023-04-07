package com.heap;

import java.util.Arrays;

public class MaxHeapToMinHeap {
    public static void main(String[] args) {
        int[] A = {9, 4, 7, 1, -2, 6, 5};

        convert(A);

        System.out.println(Arrays.toString(A));
    }

    private static void convert(int[] a) {
        int i = (a.length - 2) / 2;
        while (i >= 0) {
            heapify(a, i--, a.length);
        }
    }

    private static void heapify(int[] a, int i, int length) {
        int left = LEFT(i);
        int right = RIGHT(i);

        int smallest = i;
        if (left < length && a[left] < a[i]) {
            smallest = left;
        }
        if (right < length && a[right] < a[i]) {
            smallest = right;
        }

        if (smallest != i) {
            swap(a, i, smallest);
            heapify(a, smallest, length);
        }
    }

    private static void swap(int[] a, int i, int smallest) {
        int temp = a[i];
        a[i] = a[smallest];
        a[smallest] = a[i];
    }

    private static int RIGHT(int i) {
        return 2 * i + 2;
    }

    private static int LEFT(int i) {
        return 2 * i + 1;
    }
}
