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
        int n = scanner.nextInt();
        int a[][] = new int[n][n];

        for(int i = 0; i < n; ++i) {
            for(int j = 0; j < n; ++j) {
                if(n - 1 - i == j)
                    a[i][j] = 1;
                else if(n - 1 - i > j)
                    a[i][j] = 0;
                else
                    a[i][j] = 2;
            }
        }

        printMatrix(a);

    }

}
