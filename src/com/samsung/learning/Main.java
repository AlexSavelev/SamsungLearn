package com.samsung.learning;

import java.util.Scanner;

public class Main {
    public static int sumOfSeven(int a, int b) {
        while(a % 7 != 0 || (a / 10) % 10 == 0)
            ++a;
        int t = 0;
        while(a <= b && a / 100 == 0) {
            t += (a % 10) + ((a / 10) % 10);
            a += 7;
        }
        return t;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        int a = scanner.nextInt(), b = scanner.nextInt();

        System.out.println(sumOfSeven(a, b));

    }

}
