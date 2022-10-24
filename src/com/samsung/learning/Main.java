package com.samsung.learning;

import java.util.Scanner;

public class Main {
    public static void printMatrix(int a[][]) {
        for(int t[]: a) {
            for(int i: t)
                System.out.print(i + " ");
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        int n = scanner.nextInt(), m = scanner.nextInt();
        int a[][] = new int[n][m];
        for(int i = 0; i < n; ++i) {
            for(int j = 0; j < m; ++j)
                a[i][j] = scanner.nextInt();
        }

        int b[][] = new int[m][n];
        for(int i = 0; i < n; ++i) {
            for(int j = 0; j < m; ++j)
                b[j][n - 1 - i] = a[i][j];
        }
        System.out.print(m + " ");
        System.out.println(n);
        printMatrix(b);

    }

}
