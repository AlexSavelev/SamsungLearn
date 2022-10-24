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
        int [][] a;

        Scanner scanner = new Scanner (System.in);
        int n = scanner.nextInt(), m = scanner.nextInt();
        a = new int[n][m];

        for(int i = 0; i < n * m; ++i) {
            a[i / m][i % m] = (i / m) * (i % m);
        }

        printMatrix(a);
    }

}
