package com.samsung.learning;

import java.util.Scanner;

public class Main {
    public static int digitCount(int a) {
        int t = (a == 0 ? 1 : 0);
        while(a != 0) {
            ++t;
            a /= 10;
        }
        return t;
    }
    public static void printMatrix(int a[][]) {
        for(int t[]: a) {
            for(int i: t) {
                int k = 3 - digitCount(i);
                for(int j = 0; j < k; ++j)
                    System.out.print(" ");
                System.out.print(i);
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        int n = scanner.nextInt(), m = scanner.nextInt();
        int a[][] = new int[n][m];

        int t = 0;
        for(int i = 0; i < n; ++i) {
            if(i % 2 == 0) {
                for (int j = 0; j < m; ++j)
                    a[i][j] = t++;
            } else {
                for (int j = m - 1; j >= 0; --j)
                    a[i][j] = t++;
            }
        }

        printMatrix(a);
    }

}
