package com.heap;

public class CheckMinHeapIterative {
    private static boolean checkMinHeapRecursive(int[] arr, int index) {
        if (arr[index] <= 1) {
            return true;
        }
        for (int i = 0; i <= arr.length / 2; i++) {
            if (arr[index] > arr[index + 1] || (2 * index + 1 != arr.length && arr[index] > arr[index + 2])) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5, 6};
        int index = 0;

        if (checkMinHeapRecursive(arr, index)) {
            System.out.println("Given array is Min Heap");
        } else {
            System.out.println("Given Array is not Min Heap");
        }
    }
}
