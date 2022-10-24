package com.samsung.learning;

import java.util.Scanner;

public class Main {
    public static int sumOfDigits(int n) {
        int t = 0;
        while(n != 0) {
            t += n % 10;
            n /= 10;
        }
        return t;
    }
    public static void binFraction(double x, int n) {
        for(int i = 0; i < n; ++i) {
            x *= 2;
            System.out.print((int)x);
            if((int)x == 1)
                x -= 1;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        double x = scanner.nextDouble();
        int a = scanner.nextInt();

        binFraction(x, a);

    }

}
