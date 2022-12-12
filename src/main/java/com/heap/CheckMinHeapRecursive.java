package com.heap;

public class CheckMinHeapRecursive {

    private static boolean checkMinHeap(int[] arr, int index) {
        if (2 * index + 2 > arr.length) {
            return true;
        }
        boolean left = (arr[index] <= arr[index + 1]) && checkMinHeap(arr, 2 * index + 1);
        boolean right = (arr[index] <= arr[index + 2]) && checkMinHeap(arr, 2 * index + 2);

        return left && right;
    }

    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5, 6};
        int index = 0;

        if (checkMinHeap(arr, index)) {
            System.out.println("The given array is Min Heap");
        } else {
            System.out.println("Given array is not Min heap");
        }
    }
}
