package com.recursion;

import java.util.Scanner;

public class PrintDecreasing {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        printDecreasing(input);
    }

    private static void printDecreasing(int input) {
        if (input == 0) return;
        System.out.println(input);
        printDecreasing(--input);
    }
}
