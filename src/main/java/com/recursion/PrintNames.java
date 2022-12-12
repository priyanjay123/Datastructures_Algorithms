package com.recursion;

import java.util.Scanner;

public class PrintNames {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        printNames(0, n);
    }

    private static void printNames(int count, int n) {
        if (count == n) {
            return;
        }
        System.out.println("Priyanjay");
        count++;
        printNames(count, n);
    }
}