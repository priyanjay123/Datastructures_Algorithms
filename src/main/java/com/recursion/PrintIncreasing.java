package com.recursion;

import java.util.Scanner;

public class PrintIncreasing {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        print1ToN(input);
    }

    private static void print1ToN(int input) {
        if (input == 0) return;

        print1ToN(input - 1);
        System.out.println(input);
    }
}
