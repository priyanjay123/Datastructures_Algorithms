package com.recursion;

import java.util.Scanner;

public class SunOfFirstNnumers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        int result = sunOfN(input);
        System.out.println(result);
    }

    private static int sunOfN(int input) {
        if (input == 0)
            return 0;
        return input + sunOfN(input - 1);
    }
}
