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
            for(int j = 0; j < n; ++j)
                a[i][j] = scanner.nextInt();
        }

        boolean flag = true;
        for(int i = 0; i < n && flag; ++i) {
            for(int j = 0; j < n && flag; ++j) {
                if(i == j)
                    continue;
                if(a[i][j] != a[j][i])
                    flag = false;
            }
        }
        System.out.println(flag ? "yes" : "no");
    }

}
