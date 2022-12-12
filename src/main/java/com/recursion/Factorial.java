package com.recursion;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        int result = factorial(input);
        System.out.print(result);
    }

    private static int factorial(int input) {
        if (input == 0 || input == 1) {
            return 1;
        }
        return input * factorial(input - 1);
    }
}
